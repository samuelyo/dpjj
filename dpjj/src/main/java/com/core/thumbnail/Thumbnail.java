package main.java.com.core.thumbnail;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class Thumbnail {
	
	private static boolean proportion = true; // 是否等比缩放标记(默认为等比缩放)
	private static final String prefix = "thumbnail_";
	
	/** 
     * 生成与原图形状一致缩略图 
     *  
     * @author jamesY 
     * @date 2016-10-20  
     * @param filePath 原图路径（包括文件名）
     * @param thumbPath 缩略图将要存储的路径（包括文件名）
     * @param size 正方形缩略图边长
     * @return thumbnailName 生成的缩略图名称
     */ 
	
	public static boolean toSmaillImg( String filePath , String thumbPath , float size) throws Exception{   
        String newurl =thumbPath;   
        Image bigJpg = ImageIO.read(new File(filePath));    
        int old_w = bigJpg.getWidth(null);   
        int old_h = bigJpg.getHeight(null);      
        int new_w = 0;   
        int new_h = 0;   
        float tempdouble;    
        tempdouble = old_w > old_h ? old_w/size : old_h/size;   
        new_w = Math.round(old_w/tempdouble);   
        new_h = Math.round(old_h/tempdouble);   
        java.awt.image.BufferedImage tag = new java.awt.image.BufferedImage(new_w,new_h,java.awt.image.BufferedImage.TYPE_INT_RGB);   
        tag.getGraphics().drawImage(bigJpg,0,0,new_w,new_h,null);   
        FileOutputStream newimage = new FileOutputStream(newurl);   
        com.sun.image.codec.jpeg.JPEGImageEncoder encoder = com.sun.image.codec.jpeg.JPEGCodec.createJPEGEncoder(newimage);          
        encoder.encode(tag);   
        newimage.close();  
        return true;
    } 
	
	
	/** 
     * 生成缩略图（是否按给定长宽比例可选）
     * @param fileName 文件名
     * @param inPath  输入图路径
     * @param outPath 输出图路径
     * @param width   输出图片宽
     * @param height  输出图片高
     * @param proportion 是否按原图长宽比
     * @return boolean
     */
    
    public static boolean generateThumbnail(String fileName ,int width, int height ,String inPath,String outPath,boolean proportion) throws Exception{
        File infile = new File(inPath+fileName);
        File outfile = new File(outPath+Thumbnail.prefix+fileName);
        boolean success = execute(new FileInputStream(infile) , new FileOutputStream(outfile), width,  height,proportion);
        return success;
    }
     
    
     
    private static boolean execute(InputStream inputStream ,OutputStream outputStream,int width, int height ,boolean proportion) throws Exception {
        int fileSize = inputStream.available(); 
        BufferedImage oldImage = ImageIO.read(inputStream);
        if (oldImage.getWidth() == -1) {   
            return false;
        }
         
        int newWidth;
        int newHeight;
        // 是否是等比缩放
        if (proportion == true) {
            // 为等比缩放计算输出的图片宽度及高度
            double rate1 = ((double) oldImage.getWidth()) / (double) width;
            double rate2 = ((double) oldImage.getHeight()) / (double) height;
            // 根据缩放比率大的进行缩放控制
            double rate = rate1 > rate2 ? rate1 : rate2;
            newWidth = (int) (((double) oldImage.getWidth()) / rate);
            newHeight = (int) (((double) oldImage.getHeight()) / rate);
        } else {
            newWidth = width; // 输出的图片宽度
            newHeight = height; // 输出的图片高度
        }
        BufferedImage tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
 
        // Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
        tag.getGraphics().drawImage(oldImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);
       
        // JPEGImageEncoder可适用于其他图片类型的转换
        com.sun.image.codec.jpeg.JPEGImageEncoder encoder = com.sun.image.codec.jpeg.JPEGCodec.createJPEGEncoder(outputStream);
        encoder.encode(tag);
        inputStream.close();
        outputStream.close();
         
        return true;
    }
}
