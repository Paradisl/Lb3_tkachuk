package Lb3_Tkachuk;

//В одномерном массиве, состоящем из n вещественных элементов,вычислить:
//1) количество отрицательных элементов массива;
//2) сумму модулей элементов массива, расположенных после минимального по модулю элемента
import java.util.Scanner;
 
public class Main3OOP {
	public static void main(String[] args) { 
	//создаем масив
	Scanner scanner = new Scanner(System.in); 
    System.out.print("Введите размер масива: ");
    int size = scanner.nextInt(); 
    int array[] = new int[size]; 
    System.out.print("Введите элементы масива: ");
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt(); 
    }
    
    System.out.print ("Масив: ");
    for (int i = 0; i < size; i++) {
        System.out.print (array[i] + " "); 
    }
    
    //количество отрицательных чисел в масиве
    int count = 0;
    for (int i = 0; i < size; i++){
        if (array[i] < 0) 
        	count++;
    }
    System.out.println();    
    System.out.println("Массив имеет " + count + " отрицательных числа(-ел);");
    
    //Сумма модулей элементов массива, расположенных после минимального по модулю элемента
    int min = array[0];
    int index = 0;
    for (int i = 0; i < size; i++) {
        if (Math.abs(array[i])< Math.abs(min)) {
            min = array[i];
            index = i;
        }
    }
    int sum = 0;
    for(int i =index + 1; i<size ;i++) {
    	sum += Math.abs(array[i]);
    }
    System.out.println("Сумма модулей элементов массива, расположенных после минимального по модулю элемента " + sum);
	}
}

