package interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class Sort {
	public Sort() {
		// TODO Auto-generated constructor stub
	}
	static int[] arr = new int[5];

	public static void main(String args[]) {
		
		System.out.println(arr[3]);
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int[] arr2 = new int[arr1.length];
		//		int[] arr1 = new int[3];
		//		int[] arr2 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			//System.out.print("请输入第" + (i + 1) + "个整数:");
			//arr1[i] = scanner.nextInt();
			arr2[i] = arr1[i];
		}
		System.out.print("排序前：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "、");
		}
		System.out.println();
		int ztemp = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				if (arr1[j] > arr1[j + 1]) {
					ztemp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = ztemp;
				}
			}
		}
		int ntemp = 0;
		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = 0; j < arr2.length - 1 - i; j++) {
				if (arr2[j] < arr2[j + 1]) {
					ntemp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = ntemp;
				}
			}
		}
		System.out.print("正排序后：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "、");
		}
		System.out.println();
		System.out.print("逆排序后：");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "、");
		}
		System.out.println();
		//5阶乘
		System.out.print("阶乘：" + fn(5));
		
		try {
			new BufferedReader(new FileReader(""));
			new BufferedWriter(new FileWriter(""));
			new GZIPOutputStream(new FileOutputStream(""));
			new ObjectInputStream(new FileInputStream(""));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}

	public static int fn(int num) {
		if (num <= 1)
			return 1;
		return fn(num - 1) * num;
	}
}