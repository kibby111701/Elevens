1. You would need a deck of 52 playing cards, with it being specified that they are standard (French) playing cards, with 4 suits and 13 ranks. You would also need space on your desk to set up a 3x3 grid of these cards
2. Start by dealing out 9 cards onto the grid. Next, choose either a pair of cards or a jack, queen, and king. It does not matter what suit these cards are in. Now, if this pair adds up to eleven, or if it is a jack, queen, and king, remove these cards from the grid and place them in a "discard" pile. Draw cards from the deck of undealt cards to replace the ones you removed. Repeat this until you either played all of the cards, or if you run out of moves (no pair of cards on the grid add up to 11, and there is no set of a jack, queen and king). If the former happens, you win. If the latter happens, you lose.
3. It does contain all of the state and behavior in theory; however, some of it, such as checking if plays are legal and checking if the player can make a move. Additionally, as it currently is, there is no way to actually select any cards.
4.  a. It is called when the grid is constructed and when a new game is started.
    b. isLegal and anotherPlayIsPossible should call these methods, but the parameter selectedCards is different for them. isLegal would only have a list of size 2 or 3 while anotherPlayIsPossible would have a list that has the size of however many cards are left on the board.
    c.  0   1   2   3   4   5   6   7   8   
        Jh  6c  2s  As  4h  n   n   n   n       The lowercase letters following the rank are the suits (h for heart, c for clubs, etc.). The lowercase n means null.
    d.  public static printCards (ElevensBoard board){
            List<Integer> cIndexes = board.cardIndexes();
            for (int i = 0; i < cIndexes.size(); i++){
                System.out.println(cIndexes.get(i))     //This uses the card class's toString
            }
        }

    e. anotherPlayIsPossible needs the cardIndexes because isLegal will use a different list of selected cards chosen by the player, while anotherPlayIsPossible needs to look at the entire board but discount any null spaces on the board.