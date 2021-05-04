package Concrete;

import java.util.Scanner;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{
	
	Scanner s = new Scanner(System.in);


	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " Adl� Oyun Eklendi.");		
	}

	@Override
	public void updateGame(Game game) {
		System.out.print("Yeni Oyun �smi Giriniz: ");
		String yeniOyunIsimi = s.nextLine();
		System.out.println(game.getGameName() + " �simli Oyun " + yeniOyunIsimi + " Olarak G�ncellendi.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " �simli Oyun Kald�r�ld�.");
		
	}

}
