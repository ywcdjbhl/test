package com.you.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Test201 {
    /**
     * Execute action.
     */
    private final static int EXECUTE = 0x1;
    /**
     * Write action.
     */
    private final static int WRITE   = 0x2;
    /**
     * Read action.
     */
    private final static int READ    = 0x4;
    /**
     * Delete action.
     */
    private final static int DELETE  = 0x8;
    /**
     * Read link action.
     */
    private final static int READLINK    = 0x10;

    /**
     * All actions (read,write,execute,delete,readlink)
     */
    private final static int ALL     = READ|WRITE|EXECUTE|DELETE|READLINK;
    /**
     * No actions.
     */
    private final static int NONE    = 0x0;

	public static int getMask(String actions) {
        int mask = NONE;

        // Null action valid?
        if (actions == null) {
            return mask;
        }

        // Use object identity comparison against known-interned strings for
        // performance benefit (these values are used heavily within the JDK).
        if (actions.equals("read")) {
            return READ;
        } else if (actions.equals("write")) {
            return WRITE;
        } else if (actions.equals("execute")) {
            return EXECUTE;
        } else if (actions.equals("delete")) {
            return DELETE;
        } else if (actions.equals("readlink")) {
            return READLINK;
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

            } else if (i >= 6 && (a[i-6] == 'e' || a[i-6] == 'E') &&
                                 (a[i-5] == 'x' || a[i-5] == 'X') &&
                                 (a[i-4] == 'e' || a[i-4] == 'E') &&
                                 (a[i-3] == 'c' || a[i-3] == 'C') &&
                                 (a[i-2] == 'u' || a[i-2] == 'U') &&
                                 (a[i-1] == 't' || a[i-1] == 'T') &&
                                 (a[i] == 'e' || a[i] == 'E'))
            {
                matchlen = 7;
                mask |= EXECUTE;

            } else if (i >= 5 && (a[i-5] == 'd' || a[i-5] == 'D') &&
                                 (a[i-4] == 'e' || a[i-4] == 'E') &&
                                 (a[i-3] == 'l' || a[i-3] == 'L') &&
                                 (a[i-2] == 'e' || a[i-2] == 'E') &&
                                 (a[i-1] == 't' || a[i-1] == 'T') &&
                                 (a[i] == 'e' || a[i] == 'E'))
            {
                matchlen = 6;
                mask |= DELETE;

            } else if (i >= 7 && (a[i-7] == 'r' || a[i-7] == 'R') &&
                                 (a[i-6] == 'e' || a[i-6] == 'E') &&
                                 (a[i-5] == 'a' || a[i-5] == 'A') &&
                                 (a[i-4] == 'd' || a[i-4] == 'D') &&
                                 (a[i-3] == 'l' || a[i-3] == 'L') &&
                                 (a[i-2] == 'i' || a[i-2] == 'I') &&
                                 (a[i-1] == 'n' || a[i-1] == 'N') &&
                                 (a[i] == 'k' || a[i] == 'K'))
            {
                matchlen = 8;
                mask |= READLINK;

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
                    break;
                case ' ': case '\r': case '\n':
                case '\f': case '\t':
                    break;
                default:
                    throw new IllegalArgumentException(
                            "invalid permission: " + actions);
                }
                i--;
            }

            // point i at the location of the comma minus one (or -1).
            i -= matchlen;
        }

        return mask;
    }
	
	public static void main(String[] args) {
		int mask = getMask("readread");
		PrintStream err = System.err;
		err.println(mask);
	}
	
}
