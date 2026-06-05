package com.alibaba.fastjson2.internal;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.IOUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class CodeGenUtils {
    public static String fieldReader(int i) {
        switch (i) {
            case 0:
                return "fieldReader0";
            case 1:
                return "fieldReader1";
            case 2:
                return "fieldReader2";
            case 3:
                return "fieldReader3";
            case 4:
                return "fieldReader4";
            case 5:
                return "fieldReader5";
            case 6:
                return "fieldReader6";
            case 7:
                return "fieldReader7";
            case 8:
                return "fieldReader8";
            case 9:
                return "fieldReader9";
            case 10:
                return "fieldReader10";
            case 11:
                return "fieldReader11";
            case Opcodes.FCONST_1 /* 12 */:
                return "fieldReader12";
            case 13:
                return "fieldReader13";
            case Opcodes.DCONST_0 /* 14 */:
                return "fieldReader14";
            case 15:
                return "fieldReader15";
            default:
                int iStringSize = IOUtils.stringSize(i) + 11;
                char[] cArr = new char[iStringSize];
                "fieldReader".getChars(0, 11, cArr, 0);
                IOUtils.getChars(i, iStringSize, cArr);
                return new String(cArr);
        }
    }
}
