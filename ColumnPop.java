
public class ColumnPop {
    static char[][] letters = {
	{'n', 'o', 'h', 't', ' ', 'p', 's'},
	{'m', 'i', 'a', 'r', ' ', 'c', 'c'},
	{'l', 'l', 'e', 'k', ' ', 'a', 'h'},
	{'r', 'u', 'b', 'y', ' ', 'm', 'e'},
	{'e', 'h', 'h', 'a', 'l', 'l', 'm'},
	{'p', 'c', 'j', 'n', 'i', 'c', 'e'}
    };

    public static void main (String[] argv)
    {
	printArray ();
	popColumn (2);
	printArray ();
	popColumn (2);
	popColumn (2);
	popColumn (4);
	popColumn (4);
	popColumn (4);
	printArray ();
    }

    static void popColumn (int k)
    {
	int firstRowToShift = -1;
	for (int i=0; i<letters.length; i++) {
	    if (letters[i][k] != ' ') {
		firstRowToShift = i;
		break;
	    }
	}
	//System.out.println("firstRowToShift=" + firstRowToShift);
	
	if (firstRowToShift < 0) return;

	for (int i=letters.length-1; i>firstRowToShift; i--) {
	    letters[i][k] = letters[i-1][k];
	}
	letters[firstRowToShift][k] = ' ';
    }

    static void printArray ()
    {
	for (int i=0; i<letters.length; i++) {
	    for (int j=0; j<letters[i].length; j++) {
		System.out.print (letters[i][j] + " ");
	    }
	    System.out.println();
	}
	System.out.println();
    }
}
