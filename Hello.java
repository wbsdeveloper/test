﻿lic class Hello{
    public static void main(String[] args) {
		 System.out.println("Hello Java");

		 System.out.println("中华人民共和国");

		 System.out.println("中华人民共和国");

		 Runtime run = Runtime.getRuntime();
		 run.gc();

		 System.out.println("在master分支上对Hello.java做了修改！！"); 	

		 System.out.println("在dev分支上修改了此文件内容。。。");			
	}

}