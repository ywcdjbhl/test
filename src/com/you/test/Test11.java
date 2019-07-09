package com.you.test;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.PrintStream;
import java.util.List;

public class Test11 {
	public Test11 copy(){
		try{
			PrintStream err=System.err;
			//�������а����
			Clipboard sysboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//��ü��а������,���û������,�ͷ���null
			Transferable cliptf=sysboard.getContents(null);
		    //�����а���������ļ�
		    if(cliptf.isDataFlavorSupported(DataFlavor.javaFileListFlavor)){
				//������
			    Object obj=cliptf.getTransferData(DataFlavor.javaFileListFlavor);
			    List<File> list=(List)obj;
		    }
			//����ı������Ƿ�Ϊ�ı�����
	        if(cliptf.isDataFlavorSupported(DataFlavor.stringFlavor)){
	            String result=(String) cliptf.getTransferData(DataFlavor.stringFlavor);
	            err.println("�ı�����=="+result);
	        }			
	        //����ı������Ƿ�ΪͼƬ����
	        if(cliptf.isDataFlavorSupported(DataFlavor.imageFlavor)){
	            Image image;
	            image=(Image) cliptf.getTransferData(DataFlavor.imageFlavor);
	            err.println("ͼƬ==="+image.toString());
	        }			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new Test11();
	}
}
