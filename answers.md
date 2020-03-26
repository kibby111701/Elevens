Buggy1:
    Method: isEmpty()
    Possible source of error: isEmpty does not return the boolean (size == 0), but the boolean (size == x) where x is a number other than 0.

Buggy2:
    Method: size()
    Possible source of error: size method is not returning the size of the Deck arraylist

Buggy3: No errors

Buggy4:
    Method: deal()
    Possible source of error: As it passed the isEmpty assertion, we know that it is not dealing from an empty deck. Instead, it's possible that the statement might be checking !isEmpty to return null, which would pass the isEmpty assertion but fail the c != null assertion.

