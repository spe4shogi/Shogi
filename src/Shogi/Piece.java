package Shogi;

public interface Piece {
	
	//��𓮂������\�b�h
	public abstract void pieceMove();
	
	//����������\�b�h
	public abstract void pieceLose();
	
	//��𓾂郁�\�b�h
	public abstract void pieceGain();
	
	//��𑗂�o�����\�b�h
	public abstract void pieceSend();
}
