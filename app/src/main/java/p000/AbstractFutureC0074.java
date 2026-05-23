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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0074 implements Future {

    public static final boolean f1012 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    public static final Logger f1013 = Logger.getLogger(AbstractFutureC0074.class.getName());

    public static final AbstractC1574 f1014;

    public static final Object f1015;

    public volatile Object f1016;

    public volatile C0070 f1017;

    public volatile C0073 f1018;

    static {
        AbstractC1574 c0072;
        try {
            c0072 = new C0071(AtomicReferenceFieldUpdater.newUpdater(C0073.class, Thread.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ"), AtomicReferenceFieldUpdater.newUpdater(C0073.class, C0073.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0074.class, C0073.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0074.class, C0070.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0074.class, Object.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0072 = new C0072();
        }
        f1014 = c0072;
        if (th != null) {
            f1013.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1015 = new Object();
    }

    public static void m956(AbstractFutureC0074 abstractFutureC0074) {
        C0073 c0073;
        C0070 c0070;
        do {
            c0073 = abstractFutureC0074.f1018;
        } while (!f1014.mo953(abstractFutureC0074, c0073, C0073.f1009));
        while (c0073 != null) {
            Thread thread = c0073.f1010;
            if (thread != null) {
                c0073.f1010 = null;
                LockSupport.unpark(thread);
            }
            c0073 = c0073.f1011;
        }
        do {
            c0070 = abstractFutureC0074.f1017;
        } while (!f1014.mo951(abstractFutureC0074, c0070));
        C0070 c0071 = null;
        while (c0070 != null) {
            C0070 c0072 = c0070.f1003;
            c0070.f1003 = c0071;
            c0071 = c0070;
            c0070 = c0072;
        }
        while (c0071 != null) {
            c0071 = c0071.f1003;
            try {
                throw null;
            } catch (RuntimeException e) {
                f1013.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object m957(Object obj) throws ExecutionException {
        if (obj instanceof C0068) {
            Throwable th = ((C0068) obj).f1001;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0069) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f1015) {
            return null;
        }
        return obj;
    }

    public static Object m958(AbstractFutureC0074 abstractFutureC0074) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0074.get();
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
        C0068 c0068;
        Object obj = this.f1016;
        if (obj != null) {
            return false;
        }
        if (f1012) {
            c0068 = new C0068(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0068 = z ? C0068.f999 : C0068.f1000;
        }
        if (!f1014.mo952(this, obj, c0068)) {
            return false;
        }
        m956(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0073 c0073 = C0073.f1009;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1016;
        if (obj != null) {
            return m957(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0073 c0074 = this.f1018;
            if (c0074 != c0073) {
                C0073 c0075 = new C0073();
                while (true) {
                    AbstractC1574 abstractC1574 = f1014;
                    abstractC1574.mo954(c0075, c0074);
                    if (abstractC1574.mo953(this, c0074, c0075)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m960(c0075);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1016;
                            if (obj2 != null) {
                                return m957(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m960(c0075);
                        break;
                    }
                    c0074 = this.f1018;
                    if (c0074 == c0073) {
                    }
                }
            }
            return m957(this.f1016);
        }
        while (nanos > 0) {
            Object obj3 = this.f1016;
            if (obj3 != null) {
                return m957(obj3);
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
        String strM4748 = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM4749 = AbstractC2784.m4748(strM4748, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM47410 = strM4749 + jConvert + " " + lowerCase;
                if (z) {
                    strM47410 = AbstractC2784.m4748(strM47410, ",");
                }
                strM4749 = AbstractC2784.m4748(strM47410, " ");
            }
            if (z) {
                strM4749 = strM4749 + nanos2 + " nanoseconds ";
            }
            strM4748 = AbstractC2784.m4748(strM4749, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC2784.m4748(strM4748, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM4748 + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1016 instanceof C0068;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1016 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1016 instanceof C0068) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m959(sb);
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
            if (str != null && true) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m959(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void m959(StringBuilder sb) {
        try {
            Object objM958 = m958(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM958 == this ? "this future" : String.valueOf(objM958));
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

    public final void m960(C0073 c0073) {
        c0073.f1010 = null;
        while (true) {
            C0073 c0074 = this.f1018;
            if (c0074 == C0073.f1009) {
                return;
            }
            C0073 c0075 = null;
            while (c0074 != null) {
                C0073 c0076 = c0074.f1011;
                if (c0074.f1010 != null) {
                    c0075 = c0074;
                } else if (c0075 != null) {
                    c0075.f1011 = c0076;
                    if (c0075.f1010 == null) {
                    }
                } else if (!f1014.mo953(this, c0074, c0076)) {
                }
                c0074 = c0076;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0073 c0073 = C0073.f1009;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1016;
            if (obj2 != null) {
                return m957(obj2);
            }
            C0073 c0074 = this.f1018;
            if (c0074 != c0073) {
                C0073 c0075 = new C0073();
                do {
                    AbstractC1574 abstractC1574 = f1014;
                    abstractC1574.mo954(c0075, c0074);
                    if (abstractC1574.mo953(this, c0074, c0075)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1016;
                            } else {
                                m960(c0075);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m957(obj);
                    }
                    c0074 = this.f1018;
                } while (c0074 != c0073);
            }
            return m957(this.f1016);
        }
        throw new InterruptedException();
    }
}
