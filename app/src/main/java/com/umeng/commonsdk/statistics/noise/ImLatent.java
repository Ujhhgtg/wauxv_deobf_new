package com.umeng.commonsdk.statistics.noise;

import android.content.Context;
import com.umeng.analytics.pro.bv;
import com.umeng.commonsdk.statistics.a;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.e;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.internal.d;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ImLatent implements d {
    private static ImLatent instanse;
    private Context context;
    private StatTracer statTracer;
    private e storeHelper;
    private final int _DEFAULT_HOURS = 360;
    private final int _DEFAULT_MIN_HOURS = 36;
    private final int _DEFAULT_MIN_LATENT = 1;
    private final int _DEFAULT_MAX_LATENT = 1800;
    private final long _ONE_HOURS_IN_MS = 3600000;
    private final long _360HOURS_IN_MS = 1296000000;
    private final long _36HOURS_IN_MS = 129600000;
    private final int LATENT_MAX = 1800000;
    private final int LATENT_WINDOW = 10;
    private long latentHour = 1296000000;
    private int latentWindow = 10;
    private long mDelay = 0;
    private long mElapsed = 0;
    private boolean mLatentActivite = false;
    private Object mLatentLock = new Object();

    private ImLatent(Context context, StatTracer statTracer) {
        this.context = context;
        this.storeHelper = e.a(context);
        this.statTracer = statTracer;
    }

    public static synchronized ImLatent getService(Context context, StatTracer statTracer) {
        try {
            if (instanse == null) {
                ImLatent imLatent = new ImLatent(context, statTracer);
                instanse = imLatent;
                imLatent.onImprintChanged(ImprintHandler.getImprintService(context).c());
            }
        } catch (Throwable th) {
            throw th;
        }
        return instanse;
    }

    public long getDelayTime() {
        long j;
        synchronized (this.mLatentLock) {
            j = this.mDelay;
        }
        return j;
    }

    public long getElapsedTime() {
        return this.mElapsed;
    }

    public boolean isLatentActivite() {
        boolean z;
        synchronized (this.mLatentLock) {
            z = this.mLatentActivite;
        }
        return z;
    }

    public void latentDeactivite() {
        synchronized (this.mLatentLock) {
            this.mLatentActivite = false;
        }
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(ImprintHandler.a aVar) {
        int iIntValue = Integer.valueOf(aVar.a("latent_hours", String.valueOf(360))).intValue();
        this.latentHour = ((long) (iIntValue > 36 ? iIntValue : 360)) * 3600000;
        int iIntValue2 = Integer.valueOf(aVar.a(bv.aS, "0")).intValue();
        if (iIntValue2 < 1 || iIntValue2 > 1800) {
            iIntValue2 = 0;
        }
        if (iIntValue2 != 0) {
            this.latentWindow = iIntValue2;
            return;
        }
        int i = a.c;
        if (i <= 0 || i > 1800000) {
            this.latentWindow = 10;
        } else {
            this.latentWindow = i;
        }
    }

    public boolean shouldStartLatency() {
        if (this.storeHelper.c() || this.statTracer.isFirstRequest()) {
            return false;
        }
        synchronized (this.mLatentLock) {
            try {
                if (this.mLatentActivite) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - this.statTracer.getLastReqTime();
                if (jCurrentTimeMillis > this.latentHour) {
                    String signature = Envelope.getSignature(this.context);
                    synchronized (this.mLatentLock) {
                        this.mDelay = DataHelper.random(this.latentWindow, signature);
                        this.mElapsed = jCurrentTimeMillis;
                        this.mLatentActivite = true;
                    }
                    return true;
                }
                if (jCurrentTimeMillis <= 129600000) {
                    return false;
                }
                synchronized (this.mLatentLock) {
                    this.mDelay = 0L;
                    this.mElapsed = jCurrentTimeMillis;
                    this.mLatentActivite = true;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
