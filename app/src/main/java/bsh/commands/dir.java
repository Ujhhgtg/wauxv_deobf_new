package bsh.commands;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import p000.AbstractC2784;
import p000.C0550;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dir {

    public static final String[] f465 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void invoke(RunnableC1668 runnableC1668, C0550 c0550) {
        invoke(runnableC1668, c0550, ".");
    }

    public static void invoke(RunnableC1668 runnableC1668, C0550 c0550, String str) {
        try {
            String absolutePath = runnableC1668.m3393(str).getAbsolutePath();
            File fileM3393 = runnableC1668.m3393(str);
            if (fileM3393.exists() && fileM3393.canRead()) {
                if (!fileM3393.isDirectory()) {
                    runnableC1668.m3394("'" + str + "' is not a directory");
                }
                String[] list = fileM3393.list();
                if (list == null) {
                    list = new String[0];
                }
                Arrays.sort(list);
                for (String str2 : list) {
                    StringBuilder sbM4753 = AbstractC2784.m4753(absolutePath);
                    sbM4753.append(File.separator);
                    sbM4753.append(str2);
                    File file = new File(sbM4753.toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.canRead() ? "r" : "-");
                    sb.append(file.canWrite() ? "w" : "-");
                    sb.append("_ ");
                    Date date = new Date(file.lastModified());
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(date);
                    int i = gregorianCalendar.get(5);
                    sb.append(f465[gregorianCalendar.get(2)] + " " + i);
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
                    runnableC1668.m3394(sb.toString());
                }
                return;
            }
            runnableC1668.m3394("Can't read " + fileM3393);
        } catch (IOException e) {
            runnableC1668.m3394("error reading path: " + e);
        }
    }
}
