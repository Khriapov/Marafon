package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPiecesArray = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (int i = 0; i < chessPiecesArray.length; i++) {
            System.out.print(chessPiecesArray[i].getFigureString() + " ");
        }
        System.out.println();
        for (ChessPiece chessPiece : chessPiecesArray) {
            System.out.print(chessPiece.getFigureString() + " ");
        }
    }
}