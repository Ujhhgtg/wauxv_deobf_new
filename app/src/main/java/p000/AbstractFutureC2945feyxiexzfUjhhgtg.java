package p000;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC2945feyxiexzfUjhhgtg implements Future {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final boolean f9236Ujhhgtgfeyxiexzf = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final Logger f9237Ujhhgtgfeyxiexzf = Logger.getLogger(AbstractFutureC2945feyxiexzfUjhhgtg.class.getName());

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final AbstractC3611Ujhhgtgfeyxiexzf f9238Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final Object f9239Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public volatile Object f9240Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public volatile C2941feyxiexzfUjhhgtg f9241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public volatile C2944feyxiexzfUjhhgtg f9242Ujhhgtgfeyxiexzf;

    static {
        AbstractC3611Ujhhgtgfeyxiexzf c2943feyxiexzfUjhhgtg;
        try {
            c2943feyxiexzfUjhhgtg = new C2942feyxiexzfUjhhgtg(AtomicReferenceFieldUpdater.newUpdater(C2944feyxiexzfUjhhgtg.class, Thread.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ"), AtomicReferenceFieldUpdater.newUpdater(C2944feyxiexzfUjhhgtg.class, C2944feyxiexzfUjhhgtg.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2945feyxiexzfUjhhgtg.class, C2944feyxiexzfUjhhgtg.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2945feyxiexzfUjhhgtg.class, C2941feyxiexzfUjhhgtg.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC2945feyxiexzfUjhhgtg.class, Object.class, "上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2943feyxiexzfUjhhgtg = new C2943feyxiexzfUjhhgtg(3);
        }
        f9238Ujhhgtgfeyxiexzf = c2943feyxiexzfUjhhgtg;
        if (th != null) {
            f9237Ujhhgtgfeyxiexzf.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9239Ujhhgtgfeyxiexzf = new Object();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4304Ujhhgtgfeyxiexzf(AbstractFutureC2945feyxiexzfUjhhgtg abstractFutureC2945feyxiexzfUjhhgtg) {
        C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg;
        C2941feyxiexzfUjhhgtg c2941feyxiexzfUjhhgtg;
        do {
            c2944feyxiexzfUjhhgtg = abstractFutureC2945feyxiexzfUjhhgtg.f9242Ujhhgtgfeyxiexzf;
        } while (!f9238Ujhhgtgfeyxiexzf.mo4301Ujhhgtgfeyxiexzf(abstractFutureC2945feyxiexzfUjhhgtg, c2944feyxiexzfUjhhgtg, C2944feyxiexzfUjhhgtg.f9233Ujhhgtgfeyxiexzf));
        while (c2944feyxiexzfUjhhgtg != null) {
            Thread thread = c2944feyxiexzfUjhhgtg.f9234Ujhhgtgfeyxiexzf;
            if (thread != null) {
                c2944feyxiexzfUjhhgtg.f9234Ujhhgtgfeyxiexzf = null;
                LockSupport.unpark(thread);
            }
            c2944feyxiexzfUjhhgtg = c2944feyxiexzfUjhhgtg.f9235Ujhhgtgfeyxiexzf;
        }
        do {
            c2941feyxiexzfUjhhgtg = abstractFutureC2945feyxiexzfUjhhgtg.f9241Ujhhgtgfeyxiexzf;
        } while (!f9238Ujhhgtgfeyxiexzf.mo4299Ujhhgtgfeyxiexzf(abstractFutureC2945feyxiexzfUjhhgtg, c2941feyxiexzfUjhhgtg));
        C2941feyxiexzfUjhhgtg c2941feyxiexzfUjhhgtg2 = null;
        while (c2941feyxiexzfUjhhgtg != null) {
            C2941feyxiexzfUjhhgtg c2941feyxiexzfUjhhgtg3 = c2941feyxiexzfUjhhgtg.f9227Ujhhgtgfeyxiexzf;
            c2941feyxiexzfUjhhgtg.f9227Ujhhgtgfeyxiexzf = c2941feyxiexzfUjhhgtg2;
            c2941feyxiexzfUjhhgtg2 = c2941feyxiexzfUjhhgtg;
            c2941feyxiexzfUjhhgtg = c2941feyxiexzfUjhhgtg3;
        }
        while (c2941feyxiexzfUjhhgtg2 != null) {
            c2941feyxiexzfUjhhgtg2 = c2941feyxiexzfUjhhgtg2.f9227Ujhhgtgfeyxiexzf;
            try {
                throw null;
            } catch (RuntimeException e) {
                f9237Ujhhgtgfeyxiexzf.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static Object m4305Ujhhgtgfeyxiexzf(Object obj) throws ExecutionException {
        if (obj instanceof C2939Ujhhgtgfeyxiexzf) {
            Throwable th = ((C2939Ujhhgtgfeyxiexzf) obj).f9225Ujhhgtgfeyxiexzf;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC2940Ujhhgtgfeyxiexzf) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f9239Ujhhgtgfeyxiexzf) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static Object m4306Ujhhgtgfeyxiexzf(AbstractFutureC2945feyxiexzfUjhhgtg abstractFutureC2945feyxiexzfUjhhgtg) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC2945feyxiexzfUjhhgtg.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C2939Ujhhgtgfeyxiexzf c2939Ujhhgtgfeyxiexzf;
        Object obj = this.f9240Ujhhgtgfeyxiexzf;
        if (obj != null) {
            return false;
        }
        if (f9236Ujhhgtgfeyxiexzf) {
            c2939Ujhhgtgfeyxiexzf = new C2939Ujhhgtgfeyxiexzf(new CancellationException("Future.cancel() was called."), z);
        } else {
            c2939Ujhhgtgfeyxiexzf = z ? C2939Ujhhgtgfeyxiexzf.f9223Ujhhgtgfeyxiexzf : C2939Ujhhgtgfeyxiexzf.f9224Ujhhgtgfeyxiexzf;
        }
        if (!f9238Ujhhgtgfeyxiexzf.mo4300Ujhhgtgfeyxiexzf(this, obj, c2939Ujhhgtgfeyxiexzf)) {
            return false;
        }
        m4304Ujhhgtgfeyxiexzf(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg = C2944feyxiexzfUjhhgtg.f9233Ujhhgtgfeyxiexzf;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9240Ujhhgtgfeyxiexzf;
        if (obj != null) {
            return m4305Ujhhgtgfeyxiexzf(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg2 = this.f9242Ujhhgtgfeyxiexzf;
            if (c2944feyxiexzfUjhhgtg2 != c2944feyxiexzfUjhhgtg) {
                C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg3 = new C2944feyxiexzfUjhhgtg();
                while (true) {
                    AbstractC3611Ujhhgtgfeyxiexzf abstractC3611Ujhhgtgfeyxiexzf = f9238Ujhhgtgfeyxiexzf;
                    abstractC3611Ujhhgtgfeyxiexzf.mo4302Ujhhgtgfeyxiexzf(c2944feyxiexzfUjhhgtg3, c2944feyxiexzfUjhhgtg2);
                    if (abstractC3611Ujhhgtgfeyxiexzf.mo4301Ujhhgtgfeyxiexzf(this, c2944feyxiexzfUjhhgtg2, c2944feyxiexzfUjhhgtg3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4308Ujhhgtgfeyxiexzf(c2944feyxiexzfUjhhgtg3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9240Ujhhgtgfeyxiexzf;
                            if (obj2 != null) {
                                return m4305Ujhhgtgfeyxiexzf(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4308Ujhhgtgfeyxiexzf(c2944feyxiexzfUjhhgtg3);
                        break;
                    }
                    c2944feyxiexzfUjhhgtg2 = this.f9242Ujhhgtgfeyxiexzf;
                    if (c2944feyxiexzfUjhhgtg2 == c2944feyxiexzfUjhhgtg) {
                    }
                }
            }
            return m4305Ujhhgtgfeyxiexzf(this.f9240Ujhhgtgfeyxiexzf);
        }
        while (nanos > 0) {
            Object obj3 = this.f9240Ujhhgtgfeyxiexzf;
            if (obj3 != null) {
                return m4305Ujhhgtgfeyxiexzf(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM2703Ujhhgtgfeyxiexzf = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM2703Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM2703Ujhhgtgfeyxiexzf3 = strM2703Ujhhgtgfeyxiexzf2 + jConvert + " " + lowerCase;
                if (z) {
                    strM2703Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf3, ",");
                }
                strM2703Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf3, " ");
            }
            if (z) {
                strM2703Ujhhgtgfeyxiexzf2 = strM2703Ujhhgtgfeyxiexzf2 + nanos2 + " nanoseconds ";
            }
            strM2703Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2703Ujhhgtgfeyxiexzf, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM2703Ujhhgtgfeyxiexzf + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9240Ujhhgtgfeyxiexzf instanceof C2939Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9240Ujhhgtgfeyxiexzf != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9240Ujhhgtgfeyxiexzf instanceof C2939Ujhhgtgfeyxiexzf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4307Ujhhgtgfeyxiexzf(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m4307Ujhhgtgfeyxiexzf(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4307Ujhhgtgfeyxiexzf(StringBuilder sb) {
        try {
            Object objM4306Ujhhgtgfeyxiexzf = m4306Ujhhgtgfeyxiexzf(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4306Ujhhgtgfeyxiexzf == this ? "this future" : String.valueOf(objM4306Ujhhgtgfeyxiexzf));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m4308Ujhhgtgfeyxiexzf(C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg) {
        c2944feyxiexzfUjhhgtg.f9234Ujhhgtgfeyxiexzf = null;
        while (true) {
            C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg2 = this.f9242Ujhhgtgfeyxiexzf;
            if (c2944feyxiexzfUjhhgtg2 == C2944feyxiexzfUjhhgtg.f9233Ujhhgtgfeyxiexzf) {
                return;
            }
            C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg3 = null;
            while (c2944feyxiexzfUjhhgtg2 != null) {
                C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg4 = c2944feyxiexzfUjhhgtg2.f9235Ujhhgtgfeyxiexzf;
                if (c2944feyxiexzfUjhhgtg2.f9234Ujhhgtgfeyxiexzf != null) {
                    c2944feyxiexzfUjhhgtg3 = c2944feyxiexzfUjhhgtg2;
                } else if (c2944feyxiexzfUjhhgtg3 != null) {
                    c2944feyxiexzfUjhhgtg3.f9235Ujhhgtgfeyxiexzf = c2944feyxiexzfUjhhgtg4;
                    if (c2944feyxiexzfUjhhgtg3.f9234Ujhhgtgfeyxiexzf == null) {
                    }
                } else if (!f9238Ujhhgtgfeyxiexzf.mo4301Ujhhgtgfeyxiexzf(this, c2944feyxiexzfUjhhgtg2, c2944feyxiexzfUjhhgtg4)) {
                }
                c2944feyxiexzfUjhhgtg2 = c2944feyxiexzfUjhhgtg4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg = C2944feyxiexzfUjhhgtg.f9233Ujhhgtgfeyxiexzf;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9240Ujhhgtgfeyxiexzf;
            if (obj2 != null) {
                return m4305Ujhhgtgfeyxiexzf(obj2);
            }
            C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg2 = this.f9242Ujhhgtgfeyxiexzf;
            if (c2944feyxiexzfUjhhgtg2 != c2944feyxiexzfUjhhgtg) {
                C2944feyxiexzfUjhhgtg c2944feyxiexzfUjhhgtg3 = new C2944feyxiexzfUjhhgtg();
                do {
                    AbstractC3611Ujhhgtgfeyxiexzf abstractC3611Ujhhgtgfeyxiexzf = f9238Ujhhgtgfeyxiexzf;
                    abstractC3611Ujhhgtgfeyxiexzf.mo4302Ujhhgtgfeyxiexzf(c2944feyxiexzfUjhhgtg3, c2944feyxiexzfUjhhgtg2);
                    if (abstractC3611Ujhhgtgfeyxiexzf.mo4301Ujhhgtgfeyxiexzf(this, c2944feyxiexzfUjhhgtg2, c2944feyxiexzfUjhhgtg3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9240Ujhhgtgfeyxiexzf;
                            } else {
                                m4308Ujhhgtgfeyxiexzf(c2944feyxiexzfUjhhgtg3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4305Ujhhgtgfeyxiexzf(obj);
                    }
                    c2944feyxiexzfUjhhgtg2 = this.f9242Ujhhgtgfeyxiexzf;
                } while (c2944feyxiexzfUjhhgtg2 != c2944feyxiexzfUjhhgtg);
            }
            return m4305Ujhhgtgfeyxiexzf(this.f9240Ujhhgtgfeyxiexzf);
        }
        throw new InterruptedException();
    }
}
