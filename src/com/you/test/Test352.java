package com.you.test;
// Character.of
public class Test352 {
    // Character <= 0xff (basic latin) is handled by internal fast-path
    // to avoid initializing large tables.
    // Note: performance of this "fast-path" code may be sub-optimal
    // in negative cases for some accessors due to complicated ranges.
    // Should revisit after optimization of table initialization.

//    static final CharacterData of(int ch) {
//        if (ch >>> 8 == 0) {     // fast-path
    // 0-255
    // 00000000 00000000 00000000 00000000
    // 00000000 00000000 00000000 11111111
//            return CharacterDataLatin1.instance;
//        } else {
//            switch(ch >>> 16) {  //plane 00-16
//                case(0):
    // 0 -- 65535
    // 00000000 00000000 00000000 00000000
    // 00000000 00000000 11111111 11111111
//                    return CharacterData00.instance;
//                case(1):
    // 65536 -- 131071
    // 00000000 00000001 00000000 00000000
    // 00000000 00000001 11111111 11111111
//                    return CharacterData01.instance;
//                case(2):
    // 131072 -- 196607
    // 00000000 00000010 00000000 00000000
    // 00000000 00000010 11111111 11111111
//                    return CharacterData02.instance;
//                case(14): // 1110
    // 917504 -- 983039
    // 00000000 00001110 00000000 00000000
    // 00000000 00001110 11111111 11111111
//                    return CharacterData0E.instance;
//                case(15):   // Private Use // 1111
    // 983040 -- 1048575
    // 00000000 00001111 00000000 00000000
    // 00000000 00001111 11111111 11111111
//                case(16):   // Private Use // 10000
    // 1048576 -- 1114111
    // 00000000 00010000 00000000 00000000
    // 00000000 00010000 11111111 11111111
//                    return CharacterDataPrivateUse.instance;
//                default:
//                    return CharacterDataUndefined.instance;
//            }
//        }
//    }
}
