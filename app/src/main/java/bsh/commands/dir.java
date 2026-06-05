package bsh.commands;

import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dir {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String[] f459Ujhhgtgfeyxiexzf = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void invoke(RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        invoke(runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, ".");
    }

    public static void invoke(RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, String str) {
        try {
            String absolutePath = runnableC0026Ujhhgtgfeyxiexzf.m341Ujhhgtgfeyxiexzf(str).getAbsolutePath();
            File fileM341Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.m341Ujhhgtgfeyxiexzf(str);
            if (fileM341Ujhhgtgfeyxiexzf.exists() && fileM341Ujhhgtgfeyxiexzf.canRead()) {
                if (!fileM341Ujhhgtgfeyxiexzf.isDirectory()) {
                    runnableC0026Ujhhgtgfeyxiexzf.m342Ujhhgtgfeyxiexzf("'" + str + "' is not a directory");
                }
                String[] list = fileM341Ujhhgtgfeyxiexzf.list();
                if (list == null) {
                    list = new String[0];
                }
                Arrays.sort(list);
                for (String str2 : list) {
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(absolutePath);
                    sbM2707Ujhhgtgfeyxiexzf.append(File.separator);
                    sbM2707Ujhhgtgfeyxiexzf.append(str2);
                    File file = new File(sbM2707Ujhhgtgfeyxiexzf.toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.canRead() ? "r" : "-");
                    sb.append(file.canWrite() ? "w" : "-");
                    sb.append("_ ");
                    Date date = new Date(file.lastModified());
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(date);
                    int i = gregorianCalendar.get(5);
                    sb.append(f459Ujhhgtgfeyxiexzf[gregorianCalendar.get(2)] + " " + i);
                    if (i < 10) {
                        sb.append(" ");
                    }
                    sb.append(" ");
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = 0; i2 < 8; i2++) {
                        sb2.append(" ");
                    }
                    sb2.insert(0, file.length());
                    sb2.setLength(8);
                    int iIndexOf = sb2.toString().indexOf(" ");
                    if (iIndexOf != -1) {
                        String strSubstring = sb2.toString().substring(iIndexOf);
                        sb2.setLength(iIndexOf);
                        sb2.insert(0, strSubstring);
                    }
                    sb.append(sb2.toString());
                    sb.append(" " + file.getName());
                    if (file.isDirectory()) {
                        sb.append("/");
                    }
                    runnableC0026Ujhhgtgfeyxiexzf.m342Ujhhgtgfeyxiexzf(sb.toString());
                }
                return;
            }
            runnableC0026Ujhhgtgfeyxiexzf.m342Ujhhgtgfeyxiexzf("Can't read " + fileM341Ujhhgtgfeyxiexzf);
        } catch (IOException e) {
            runnableC0026Ujhhgtgfeyxiexzf.m342Ujhhgtgfeyxiexzf("error reading path: " + e);
        }
    }
}
