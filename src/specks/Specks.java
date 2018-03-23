package specks;

import java.util.Scanner;

public class Specks {
	
	private int size = 2;						//Размер поля
	private int[][] tab = new int[size][size];	//Поле
	
	public void default_pos()			//Позиции решенной игры
	{
		for (int i = 0; i<size; i++)
		{
			for (int j = 0; j<size; j++)
			{
				tab[i][j] = j+size*i+1;
				if ((i+1 == size)&&(j+1 == size))
					tab[i][j] = 0;
			}
		}
	}
	
	public void print_tab()				//Вывод поля
	{
		for (int i = 0; i<size; i++)
		{
			for (int j = 0; j<size; j++)
			{
				System.out.printf("%3d",tab[i][j]);
			}
			System.out.println();
		}
	}
	
	public void add_start_pos()		//Ввод начальных позиций
	{
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<size; i++)
		{
			for (int j = 0; j<size; j++)
			{
				tab[i][j] = scan.nextInt();
			}
		}
	}
	
	
	public int min_number_of_steps()	//Вычисление и вывод минимального количества ходов для решения
	{
		int steps = 0;
		for (int i = 0; i<size; i++)
		{
			for (int j = 0; j<size; j++)
			{
				if (tab[i][j] != j+size*i+1)
				steps = tab[i][j]  +  j+size*i+1;
			}
		}
		return steps;
	}
	
	
}
