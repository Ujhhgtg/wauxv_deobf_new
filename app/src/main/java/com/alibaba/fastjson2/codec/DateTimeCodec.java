package com.alibaba.fastjson2.codec;

import com.umeng.analytics.pro.bv;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class DateTimeCodec {
    DateTimeFormatter dateFormatter;
    public final String format;
    protected final boolean formatHasDay;
    protected final boolean formatHasHour;
    public final boolean formatISO8601;
    public final boolean formatMillis;
    public final boolean formatUnixTime;
    public final Locale locale;
    protected final boolean useSimpleDateFormat;
    public final boolean useSimpleFormatter;
    protected final boolean yyyyMMdd10;
    protected final boolean yyyyMMdd8;
    protected final boolean yyyyMMddhhmm16;
    protected final boolean yyyyMMddhhmmss14;
    protected final boolean yyyyMMddhhmmss19;

    public DateTimeCodec(String str) {
        this(str, null);
    }

    public DateTimeFormatter getDateFormatter() {
        String str;
        if (this.dateFormatter == null && (str = this.format) != null && !this.formatMillis && !this.formatISO8601 && !this.formatUnixTime) {
            Locale locale = this.locale;
            if (locale == null) {
                this.dateFormatter = DateTimeFormatter.ofPattern(str);
            } else {
                this.dateFormatter = DateTimeFormatter.ofPattern(str, locale);
            }
        }
        return this.dateFormatter;
    }

    public DateTimeCodec(String str, Locale locale) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        str = str != null ? str.replace("aa", "a") : str;
        this.format = str;
        this.locale = locale;
        this.yyyyMMddhhmmss14 = "yyyyMMddHHmmss".equals(str);
        this.yyyyMMddhhmmss19 = "yyyy-MM-dd HH:mm:ss".equals(str);
        this.yyyyMMddhhmm16 = "yyyy-MM-dd HH:mm".equals(str);
        this.yyyyMMdd10 = "yyyy-MM-dd".equals(str);
        this.yyyyMMdd8 = "yyyyMMdd".equals(str);
        this.useSimpleDateFormat = "yyyy-MM-dd'T'HH:mm:ssXXX".equals(str);
        boolean z5 = false;
        if (str != null) {
            z2 = true;
            switch (str) {
                case "millis":
                    z = false;
                    z3 = false;
                    break;
                case "unixtime":
                    z = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                    z2 = false;
                    break;
                case "iso8601":
                    z3 = false;
                    z4 = false;
                    z = true;
                    z2 = false;
                    break;
                default:
                    boolean z6 = str.indexOf(100) != -1;
                    if (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) {
                        z2 = false;
                    }
                    z3 = z6;
                    z4 = z2;
                    z = false;
                    z2 = false;
                    break;
            }
            this.formatUnixTime = z5;
            this.formatMillis = z2;
            this.formatISO8601 = z;
            this.formatHasDay = z3;
            this.formatHasHour = z4;
            this.useSimpleFormatter = "yyyyMMddHHmmssSSSZ".equals(str);
        }
        z = false;
        z2 = false;
        z3 = false;
        z4 = false;
        this.formatUnixTime = z5;
        this.formatMillis = false;
        this.formatISO8601 = false;
        this.formatHasDay = false;
        this.formatHasHour = false;
        this.useSimpleFormatter = "yyyyMMddHHmmssSSSZ".equals(str);
    }

    public DateTimeFormatter getDateFormatter(Locale locale) {
        Locale locale2;
        if (this.format == null || this.formatMillis || this.formatISO8601 || this.formatUnixTime) {
            return null;
        }
        if (this.dateFormatter != null && ((this.locale == null && (locale == null || locale == Locale.getDefault())) || ((locale2 = this.locale) != null && locale2.equals(locale)))) {
            return this.dateFormatter;
        }
        if (locale == null) {
            Locale locale3 = this.locale;
            if (locale3 == null) {
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(this.format);
                this.dateFormatter = dateTimeFormatterOfPattern;
                return dateTimeFormatterOfPattern;
            }
            DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(this.format, locale3);
            this.dateFormatter = dateTimeFormatterOfPattern2;
            return dateTimeFormatterOfPattern2;
        }
        DateTimeFormatter dateTimeFormatterOfPattern3 = DateTimeFormatter.ofPattern(this.format, locale);
        this.dateFormatter = dateTimeFormatterOfPattern3;
        return dateTimeFormatterOfPattern3;
    }
}
