package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ep extends er {
    protected InputStream a;
    protected OutputStream b;

    public ep() {
        this.a = null;
        this.b = null;
    }

    @Override // com.umeng.analytics.pro.er
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.er
    public void b() {
    }

    @Override // com.umeng.analytics.pro.er
    public void c() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.a = null;
        }
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
    }

    @Override // com.umeng.analytics.pro.er
    public void d() throws es {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new es(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new es(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.er
    public int a(byte[] bArr, int i, int i2) throws es {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new es(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new es(4);
        } catch (IOException e) {
            throw new es(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.er
    public void b(byte[] bArr, int i, int i2) throws es {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new es(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new es(0, e);
        }
    }

    public ep(InputStream inputStream) {
        this.b = null;
        this.a = inputStream;
    }

    public ep(OutputStream outputStream) {
        this.a = null;
        this.b = outputStream;
    }

    public ep(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }
}
