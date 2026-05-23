package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.chrono.ThaiBuddhistDate;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplThaiBuddhistDate extends ObjectReaderPrimitive<ThaiBuddhistDate> {
    static final ObjectReaderImplThaiBuddhistDate INSTANCE = new ObjectReaderImplThaiBuddhistDate();

    public ObjectReaderImplThaiBuddhistDate() {
        super(ThaiBuddhistDate.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Era findEra(Chronology chronology, String str) {
        for (Era era : chronology.eras()) {
            if (str.equals(era.toString()) || ((era instanceof Enum) && str.equals(((Enum) era).name()))) {
                return era;
            }
        }
        return null;
    }

    private static int[] parseChronoDatePart(String str) {
        int i;
        int i2;
        int iIndexOf = str.indexOf(45);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str.indexOf(45, iIndexOf + 1);
        if (iIndexOf <= 0 || iIndexOf2 <= (i = iIndexOf + 1) || (i2 = iIndexOf2 + 1) >= str.length()) {
            throw new DateTimeException("Invalid date: ".concat(str));
        }
        return new int[]{parseChronoInt(str, 0, iIndexOf), parseChronoInt(str, i, iIndexOf2), parseChronoInt(str, i2, str.length())};
    }

    private static int parseChronoInt(String str, int i, int i2) {
        try {
            return Integer.parseInt(str.substring(i, i2));
        } catch (NumberFormatException e) {
            throw new DateTimeException("Invalid number: " + str.substring(i, i2), e);
        }
    }

    private static ChronoLocalDate parseChronoLocalDate(String str, Chronology chronology) {
        int i;
        int iIndexOf = str.indexOf(32);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str.indexOf(32, iIndexOf + 1);
        if (iIndexOf <= 0 || iIndexOf2 <= (i = iIndexOf + 1)) {
            return chronology.date(LocalDate.parse(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (!chronology.getId().equals(strSubstring)) {
            throw new DateTimeException(AbstractC2784.m4757("Invalid chronology: ", strSubstring));
        }
        String strSubstring2 = str.substring(i, iIndexOf2);
        Era eraFindEra = findEra(chronology, strSubstring2);
        if (eraFindEra == null) {
            throw new DateTimeException(AbstractC2784.m4757("Invalid era: ", strSubstring2));
        }
        int[] chronoDatePart = parseChronoDatePart(str.substring(iIndexOf2 + 1));
        return chronology.date(eraFindEra, chronoDatePart[0], chronoDatePart[1], chronoDatePart[2]);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public ThaiBuddhistDate readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return (ThaiBuddhistDate) parseChronoLocalDate(string, ThaiBuddhistChronology.INSTANCE);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ThaiBuddhistDate readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return (ThaiBuddhistDate) parseChronoLocalDate(string, ThaiBuddhistChronology.INSTANCE);
    }
}
