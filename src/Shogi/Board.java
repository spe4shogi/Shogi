package Shogi;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 将棋のゲーム。
 * 
 * 2人対戦式。
 * テスト用
 */
public class Board extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JPanel panel = new JPanel();
	JButton[][] playBoard = new JButton[9][9];
	
	public Board() {
		
		Container contentPane = getContentPane();			//フレーム上にパネルの設置
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    contentPane.add(panel,BorderLayout.CENTER);
		
	    panel.setLayout(null);
		
		for (int x = 0; x < 9; x++) {
			 for (int y = 0; y < 9; y++) {
				playBoard[x][y] = new JButton();
				playBoard[x][y].setBounds(y *50 + 50, x *50 + 50, 50, 50);
				/*
				 * デフォルトの駒の並びを設定。
				 * 
				 * 未定義。
				 */
				panel.add(playBoard[x][y]);
				playBoard[x][y].addActionListener(this);
				playBoard[x][y].setVisible(true);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Board board = new Board();
		board.setTitle("将棋");
		board.setBounds(300, 50, 600, 600);
		board.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * アクションコマンドがセットされてるかどうかの判定（押されたボタンがどの駒なのか）
		 * 
		 * 
		 */
		
	}
	
}
