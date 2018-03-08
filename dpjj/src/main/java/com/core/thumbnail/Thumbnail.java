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
	
	private static boolean proportion = true; // �Ƿ�ȱ����ű��(Ĭ��Ϊ�ȱ�����)
	private static final String prefix = "thumbnail_";
	
	/** 
     * ������ԭͼ��״һ������ͼ 
     *  
     * @author jamesY 
     * @date 2016-10-20  
     * @param filePath ԭͼ·���������ļ�����
     * @param thumbPath ����ͼ��Ҫ�洢��·���������ļ�����
     * @param size ����������ͼ�߳�
     * @return thumbnailName ���ɵ�����ͼ����
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
     * ��������ͼ���Ƿ񰴸������������ѡ��
     * @param fileName �ļ���
     * @param inPath  ����ͼ·��
     * @param outPath ���ͼ·��
     * @param width   ���ͼƬ��
     * @param height  ���ͼƬ��
     * @param proportion �Ƿ�ԭͼ�����
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
        // �Ƿ��ǵȱ�����
        if (proportion == true) {
            // Ϊ�ȱ����ż��������ͼƬ��ȼ��߶�
            double rate1 = ((double) oldImage.getWidth()) / (double) width;
            double rate2 = ((double) oldImage.getHeight()) / (double) height;
            // �������ű��ʴ�Ľ������ſ���
            double rate = rate1 > rate2 ? rate1 : rate2;
            newWidth = (int) (((double) oldImage.getWidth()) / rate);
            newHeight = (int) (((double) oldImage.getHeight()) / rate);
        } else {
            newWidth = width; // �����ͼƬ���
            newHeight = height; // �����ͼƬ�߶�
        }
        BufferedImage tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
 
        // Image.SCALE_SMOOTH �������㷨 ��������ͼƬ��ƽ���ȵ� ���ȼ����ٶȸ� ���ɵ�ͼƬ�����ȽϺ� ���ٶ���
        tag.getGraphics().drawImage(oldImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);
       
        // JPEGImageEncoder������������ͼƬ���͵�ת��
        com.sun.image.codec.jpeg.JPEGImageEncoder encoder = com.sun.image.codec.jpeg.JPEGCodec.createJPEGEncoder(outputStream);
        encoder.encode(tag);
        inputStream.close();
        outputStream.close();
         
        return true;
    }
}
