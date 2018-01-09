package io;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.FileUtils;

public class ChangeFileEncode {
	public static void main(String[] args) throws IOException {
		// GBK�����ʽԴ��·��
		String srcDirPath = "E:\\Z\\eclipse\\gww\\oums-new\\src\\main\\java";
		// תΪUTF-8�����ʽԴ��·��
		String utf8DirPath = "E:\\Z\\eclipse\\gww\\oums-new\\src\\main\\java2";
		// ��ȡ����java�ļ�
		Collection<File> javaGbkFileCol = FileUtils.listFiles(new File(srcDirPath), new String[] { "java" }, true);

		for (File javaGbkFile : javaGbkFileCol) {
			// UTF8��ʽ�ļ�·��
			String utf8FilePath = utf8DirPath + javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
			// ʹ��GBK��ȡ���ݣ�Ȼ����UTF-8д������
			FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));
		}
	}
}
