package main.java.com.core.fileOperateUtil;

import java.io.File;

public class FileDeleteUtil {
	
	
	/** 
     * 删除单个文件 
     *  
     * @author jamesY 
     * @date 2016-10-21 
     * @param delFileDir  要删除的文件或空目录
     * @param  
     * @return 
     * @throws 
     */  
    public static void doDeleteEmptyDir(String delEmptyFileDir) {
        boolean success = (new File(delEmptyFileDir)).delete();
 
    }

    /**
     * 递归删除目录下的所有文件及子目录下所有文件
     * @author jamesY 
     * @date   2016-10-21 
     * @param  delFilesDir 将要删除的文件目录
     * @return boolean Returns "true" if all deletions were successful.
     *                 If a deletion fails, the method stops attempting to
     *                 delete and returns "false".
     */
    public static boolean deleteDir(File delFilesDir) {
        if (delFilesDir.isDirectory()) {
            String[] children = delFilesDir.list();

            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(delFilesDir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return true;
    }
}
