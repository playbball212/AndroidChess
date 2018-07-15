package com.example.ag67440.thebattlefield;

import java.util.List;

public class KnightAnalyzer extends AlphabetMapper  implements PieceAnalyzer {

    private ChessTileView view1;
    private ChessTileView view2;

    public KnightAnalyzer( ChessTileView view1, ChessTileView view2) {
        this.view1 = view1;
        this.view2 = view2;
    }

    @Override
    public boolean isThisALegalMove() {


        return false;
    }
}
