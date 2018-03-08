package main.java.com.core.fileOperateUtil;

import java.io.File;

public class FileDeleteUtil {
	
	
	/** 
     * ɾ�������ļ� 
     *  
     * @author jamesY 
     * @date 2016-10-21 
     * @param delFileDir  Ҫɾ�����ļ����Ŀ¼
     * @param  
     * @return 
     * @throws 
     */  
    public static void doDeleteEmptyDir(String delEmptyFileDir) {
        boolean success = (new File(delEmptyFileDir)).delete();
 
    }

    /**
     * �ݹ�ɾ��Ŀ¼�µ������ļ�����Ŀ¼�������ļ�
     * @author jamesY 
     * @date   2016-10-21 
     * @param  delFilesDir ��Ҫɾ�����ļ�Ŀ¼
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
        // Ŀ¼��ʱΪ�գ�����ɾ��
        return true;
    }
}
