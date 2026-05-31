package bsh.commands;

import bsh.RunnableC0008;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import p000.AbstractC2844;
import p000.C0527;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dir {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final String[] f465 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void invoke(RunnableC0008 runnableC0008, C0527 c0527) {
        invoke(runnableC0008, c0527, ".");
    }

    public static void invoke(RunnableC0008 runnableC0008, C0527 c0527, String str) {
        try {
            String absolutePath = runnableC0008.m343(str).getAbsolutePath();
            File fileM343 = runnableC0008.m343(str);
            if (fileM343.exists() && fileM343.canRead()) {
                if (!fileM343.isDirectory()) {
                    runnableC0008.m344("'" + str + "' is not a directory");
                }
                String[] list = fileM343.list();
                if (list == null) {
                    list = new String[0];
                }
                Arrays.sort(list);
                for (String str2 : list) {
                    StringBuilder sbM4787 = AbstractC2844.m4787(absolutePath);
                    sbM4787.append(File.separator);
                    sbM4787.append(str2);
                    File file = new File(sbM4787.toString());
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
                    runnableC0008.m344(sb.toString());
                }
                return;
            }
            runnableC0008.m344("Can't read " + fileM343);
        } catch (IOException e) {
            runnableC0008.m344("error reading path: " + e);
        }
    }
}
