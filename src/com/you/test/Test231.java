package com.you.test;

import sun.security.util.SecurityConstants;

public class Test231 {

    /**
     * Read action.
     */
    private final static int READ    = 0x1;

    /**
     * Write action.
     */
    private final static int WRITE   = 0x2;
    /**
     * All actions (read,write);
     */
    private final static int ALL     = READ|WRITE;
    /**
     * No actions.
     */
    private final static int NONE    = 0x0;

    /**
     * The actions mask.
     *
     */
    private transient int mask;

    /**
     * The actions string.
     *
     * @serial 
     */
    private String actions; // Left null as long as possible, then
                            // created and re-used in the getAction function.


    private static int getMask(String actions) {

	int mask = NONE;

	if (actions == null) {
	    return mask;
	}

	// Check against use of constants (used heavily within the JDK)
	if (actions == SecurityConstants.PROPERTY_READ_ACTION) {
	    return READ;
	} if (actions == SecurityConstants.PROPERTY_WRITE_ACTION) {
	    return WRITE;
	} else if (actions == SecurityConstants.PROPERTY_RW_ACTION) {
	    return READ|WRITE;
	}

	char[] a = actions.toCharArray();

	int i = a.length - 1;
	if (i < 0)
	    return mask;

	while (i != -1) {
	    char c;

	    // skip whitespace
	    while ((i!=-1) && ((c = a[i]) == ' ' ||
			       c == '\r' ||
			       c == '\n' ||
			       c == '\f' ||
			       c == '\t'))
		i--;

	    // check for the known strings
	    int matchlen;

	    if (i >= 3 && (a[i-3] == 'r' || a[i-3] == 'R') &&
			  (a[i-2] == 'e' || a[i-2] == 'E') &&
			  (a[i-1] == 'a' || a[i-1] == 'A') &&
			  (a[i] == 'd' || a[i] == 'D'))
	    {
		matchlen = 4;
		mask |= READ;

	    } else if (i >= 4 && (a[i-4] == 'w' || a[i-4] == 'W') &&
				 (a[i-3] == 'r' || a[i-3] == 'R') &&
				 (a[i-2] == 'i' || a[i-2] == 'I') &&
				 (a[i-1] == 't' || a[i-1] == 'T') &&
				 (a[i] == 'e' || a[i] == 'E'))
	    {
		matchlen = 5;
		mask |= WRITE;

	    } else {
		// parse error
		throw new IllegalArgumentException(
			"invalid permission: " + actions);
	    }

	    // make sure we didn't just match the tail of a word
	    // like "ackbarfaccept".  Also, skip to the comma.
	    boolean seencomma = false;
	    while (i >= matchlen && !seencomma) {
		switch(a[i-matchlen]) {
		case ',':
		    seencomma = true;
		    /*FALLTHROUGH*/
		case ' ': case '\r': case '\n':
		case '\f': case '\t':
		    break;
		default:
		    throw new IllegalArgumentException(
			    "invalid permission2: " + actions);
		}
		i--;
	    }

	    // point i at the location of the comma minus one (or -1).
	    i -= matchlen;
	}

	return mask;
    }
	public static void main(String[] args) {
		Test231 test = new Test231();
		int i = test.getMask(" ,read");
		System.out.println(i);
	}
}
