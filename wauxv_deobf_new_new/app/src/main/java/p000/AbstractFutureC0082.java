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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFutureC0082 implements Future {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final boolean f1077 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final Logger f1078 = Logger.getLogger(AbstractFutureC0082.class.getName());

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final AbstractC1469 f1079;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final Object f1080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile Object f1081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile C0078 f1082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public volatile C0081 f1083;

    static {
        AbstractC1469 c0080;
        try {
            c0080 = new C0079(AtomicReferenceFieldUpdater.newUpdater(C0081.class, Thread.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ"), AtomicReferenceFieldUpdater.newUpdater(C0081.class, C0081.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0082.class, C0081.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0082.class, C0078.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0082.class, Object.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0080 = new C0080();
        }
        f1079 = c0080;
        if (th != null) {
            f1078.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1080 = new Object();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m1101(AbstractFutureC0082 abstractFutureC0082) {
        C0081 c0081;
        C0078 c0078;
        do {
            c0081 = abstractFutureC0082.f1083;
        } while (!f1079.mo1098(abstractFutureC0082, c0081, C0081.f1074));
        while (c0081 != null) {
            Thread thread = c0081.f1075;
            if (thread != null) {
                c0081.f1075 = null;
                LockSupport.unpark(thread);
            }
            c0081 = c0081.f1076;
        }
        do {
            c0078 = abstractFutureC0082.f1082;
        } while (!f1079.mo1096(abstractFutureC0082, c0078));
        C0078 c0079 = null;
        while (c0078 != null) {
            C0078 c00710 = c0078.f1068;
            c0078.f1068 = c0079;
            c0079 = c0078;
            c0078 = c00710;
        }
        while (c0079 != null) {
            c0079 = c0079.f1068;
            try {
                throw null;
            } catch (RuntimeException e) {
                f1078.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Object m1102(Object obj) throws ExecutionException {
        if (obj instanceof C0076) {
            Throwable th = ((C0076) obj).f1066;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0077) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f1080) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Object m1103(AbstractFutureC0082 abstractFutureC0082) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractFutureC0082.get();
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
        C0076 c0076;
        Object obj = this.f1081;
        if (obj != null) {
            return false;
        }
        if (f1077) {
            c0076 = new C0076(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0076 = z ? C0076.f1064 : C0076.f1065;
        }
        if (!f1079.mo1097(this, obj, c0076)) {
            return false;
        }
        m1101(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0081 c0081 = C0081.f1074;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1081;
        if (obj != null) {
            return m1102(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0081 c0082 = this.f1083;
            if (c0082 != c0081) {
                C0081 c0083 = new C0081();
                while (true) {
                    AbstractC1469 abstractC1469 = f1079;
                    abstractC1469.mo1099(c0083, c0082);
                    if (abstractC1469.mo1098(this, c0082, c0083)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m1105(c0083);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1081;
                            if (obj2 != null) {
                                return m1102(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m1105(c0083);
                        break;
                    }
                    c0082 = this.f1083;
                    if (c0082 == c0081) {
                    }
                }
            }
            return m1102(this.f1081);
        }
        while (nanos > 0) {
            Object obj3 = this.f1081;
            if (obj3 != null) {
                return m1102(obj3);
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
        String strM4782 = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM4783 = AbstractC2844.m4782(strM4782, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM4784 = strM4783 + jConvert + " " + lowerCase;
                if (z) {
                    strM4784 = AbstractC2844.m4782(strM4784, ",");
                }
                strM4783 = AbstractC2844.m4782(strM4784, " ");
            }
            if (z) {
                strM4783 = strM4783 + nanos2 + " nanoseconds ";
            }
            strM4782 = AbstractC2844.m4782(strM4783, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC2844.m4782(strM4782, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM4782 + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1081 instanceof C0076;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1081 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1081 instanceof C0076) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m1104(sb);
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
                m1104(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1104(StringBuilder sb) {
        try {
            Object objM1103 = m1103(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM1103 == this ? "this future" : String.valueOf(objM1103));
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1105(C0081 c0081) {
        c0081.f1075 = null;
        while (true) {
            C0081 c0082 = this.f1083;
            if (c0082 == C0081.f1074) {
                return;
            }
            C0081 c0083 = null;
            while (c0082 != null) {
                C0081 c0084 = c0082.f1076;
                if (c0082.f1075 != null) {
                    c0083 = c0082;
                } else if (c0083 != null) {
                    c0083.f1076 = c0084;
                    if (c0083.f1075 == null) {
                    }
                } else if (!f1079.mo1098(this, c0082, c0084)) {
                }
                c0082 = c0084;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0081 c0081 = C0081.f1074;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1081;
            if (obj2 != null) {
                return m1102(obj2);
            }
            C0081 c0082 = this.f1083;
            if (c0082 != c0081) {
                C0081 c0083 = new C0081();
                do {
                    AbstractC1469 abstractC1469 = f1079;
                    abstractC1469.mo1099(c0083, c0082);
                    if (abstractC1469.mo1098(this, c0082, c0083)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1081;
                            } else {
                                m1105(c0083);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m1102(obj);
                    }
                    c0082 = this.f1083;
                } while (c0082 != c0081);
            }
            return m1102(this.f1081);
        }
        throw new InterruptedException();
    }
}
