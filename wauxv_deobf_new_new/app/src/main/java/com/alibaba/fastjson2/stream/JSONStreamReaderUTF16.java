package com.alibaba.fastjson2.stream;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.stream.StreamReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class JSONStreamReaderUTF16<T> extends JSONStreamReader<T> {
    char[] buf;
    final JSONReader.Context context;
    final Reader input;

    public JSONStreamReaderUTF16(Reader reader, ObjectReaderAdapter objectReaderAdapter) {
        super(objectReaderAdapter);
        this.input = reader;
        this.context = JSONFactory.createReadContext();
    }

    @Override // com.alibaba.fastjson2.stream.StreamReader
    public <T> T readLineObject() {
        Type[] typeArr;
        try {
            if (this.inputEnd) {
                return null;
            }
            if ((this.input == null && this.off >= this.end) || !seekLine()) {
                return null;
            }
            char[] cArr = this.buf;
            int i = this.lineStart;
            JSONReader jSONReaderOf = JSONReader.of(cArr, i, this.lineEnd - i, this.context);
            ObjectReaderAdapter objectReaderAdapter = this.objectReader;
            if (objectReaderAdapter != null) {
                return objectReaderAdapter.readObject(jSONReaderOf, null, null, this.features);
            }
            return (!jSONReaderOf.isArray() || (typeArr = this.types) == null || typeArr.length == 0) ? (T) jSONReaderOf.readAny() : (T) jSONReaderOf.readList(typeArr);
        } catch (IOException e) {
            throw new JSONException("seekLine error", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:77:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0058 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson2.stream.StreamReader
    public boolean seekLine() throws IOException {
        int i;
        char[] cArr;
        char c;
        int i2;
        Reader reader;
        if (this.buf == null && (reader = this.input) != null) {
            char[] cArr2 = new char[524288];
            this.buf = cArr2;
            int i3 = reader.read(cArr2);
            if (i3 == -1) {
                this.inputEnd = true;
                return false;
            }
            this.end = i3;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            this.lineTerminated = false;
            int i5 = this.off;
            while (true) {
                i = this.end;
                if (i5 >= i) {
                    break;
                }
                if (i5 + 4 < i) {
                    char[] cArr3 = this.buf;
                    char c2 = cArr3[i5];
                    char c3 = cArr3[i5 + 1];
                    char c4 = cArr3[i5 + 2];
                    int i6 = i5 + 3;
                    char c5 = cArr3[i6];
                    if (c2 <= '\"' || c3 <= '\"' || c4 <= '\"' || c5 <= '\"') {
                        cArr = this.buf;
                        c = cArr[i5];
                        if (c == '\n') {
                            if (this.lineSize <= 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                                this.rowCount++;
                            }
                            this.lineTerminated = true;
                            this.lineSize = 0;
                            this.lineEnd = i5;
                            this.lineStart = this.lineNextStart;
                            int i7 = i5 + 1;
                            this.off = i7;
                            this.lineNextStart = i7;
                            break;
                        }
                        if (c == '\r') {
                            if (this.lineSize <= 0 || (this.features & StreamReader.Feature.IgnoreEmptyLine.mask) == 0) {
                                this.rowCount++;
                            }
                            this.lineTerminated = true;
                            this.lineSize = 0;
                            this.lineEnd = i5;
                            i2 = i5 + 1;
                            if (i2 < i) {
                                break;
                            }
                            if (cArr[i2] == '\n') {
                                i5 = i2;
                            }
                            this.lineStart = this.lineNextStart;
                            int i8 = i5 + 1;
                            this.off = i8;
                            this.lineNextStart = i8;
                            break;
                        }
                        this.lineSize++;
                    } else {
                        this.lineSize += 4;
                        i5 = i6;
                    }
                    i5++;
                } else {
                    cArr = this.buf;
                    c = cArr[i5];
                    if (c == '\n') {
                        if (this.lineSize <= 0) {
                            this.rowCount++;
                        } else {
                            this.rowCount++;
                        }
                        this.lineTerminated = true;
                        this.lineSize = 0;
                        this.lineEnd = i5;
                        this.lineStart = this.lineNextStart;
                        int i9 = i5 + 1;
                        this.off = i9;
                        this.lineNextStart = i9;
                        break;
                    }
                    if (c == '\r') {
                        if (this.lineSize <= 0) {
                            this.rowCount++;
                        } else {
                            this.rowCount++;
                        }
                        this.lineTerminated = true;
                        this.lineSize = 0;
                        this.lineEnd = i5;
                        i2 = i5 + 1;
                        if (i2 < i) {
                            break;
                        }
                        if (cArr[i2] == '\n') {
                            i5 = i2;
                        }
                        this.lineStart = this.lineNextStart;
                        int i10 = i5 + 1;
                        this.off = i10;
                        this.lineNextStart = i10;
                        break;
                    }
                    this.lineSize++;
                    i5++;
                }
            }
            if (!this.lineTerminated) {
                if (this.input != null && !this.inputEnd) {
                    int i11 = this.off;
                    int i12 = i - i11;
                    if (i11 > 0) {
                        if (i12 > 0) {
                            char[] cArr4 = this.buf;
                            System.arraycopy(cArr4, i11, cArr4, 0, i12);
                        }
                        this.lineNextStart = 0;
                        this.lineStart = 0;
                        this.off = 0;
                        this.end = i12;
                    }
                    Reader reader2 = this.input;
                    char[] cArr5 = this.buf;
                    int i13 = this.end;
                    int i14 = reader2.read(cArr5, i13, cArr5.length - i13);
                    if (i14 == -1) {
                        this.inputEnd = true;
                        if (this.off == this.end) {
                            return false;
                        }
                    } else {
                        this.end += i14;
                    }
                }
                this.lineStart = this.lineNextStart;
                int i15 = this.end;
                this.lineEnd = i15;
                this.rowCount++;
                this.lineSize = 0;
                this.off = i15;
            }
            this.lineTerminated = this.off == this.end;
        }
        return true;
    }

    public JSONStreamReaderUTF16(Reader reader, Type[] typeArr) {
        super(typeArr);
        this.input = reader;
        this.context = JSONFactory.createReadContext();
    }
}
