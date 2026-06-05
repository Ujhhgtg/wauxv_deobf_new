package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1274feyxiexzfUjhhgtg implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f4651Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Handler f4652Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final HashMap f4653Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public HashSet f4654Ujhhgtgfeyxiexzf = new HashSet();

    public ServiceConnectionC1274feyxiexzfUjhhgtg(Context context) {
        this.f4651Ujhhgtgfeyxiexzf = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f4652Ujhhgtgfeyxiexzf = new Handler(handlerThread.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC0740Ujhhgtgfeyxiexzf interfaceC0740Ujhhgtgfeyxiexzf = null;
        if (i == 0) {
            C1273feyxiexzfUjhhgtg c1273feyxiexzfUjhhgtg = (C1273feyxiexzfUjhhgtg) message.obj;
            String string = Settings.Secure.getString(this.f4651Ujhhgtgfeyxiexzf.getContentResolver(), "enabled_notification_listeners");
            synchronized (C1282feyxiexzfUjhhgtg.f4672Ujhhgtgfeyxiexzf) {
                if (string != null) {
                    try {
                        if (!string.equals(C1282feyxiexzfUjhhgtg.f4673Ujhhgtgfeyxiexzf)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            C1282feyxiexzfUjhhgtg.f4674Ujhhgtgfeyxiexzf = hashSet2;
                            C1282feyxiexzfUjhhgtg.f4673Ujhhgtgfeyxiexzf = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = C1282feyxiexzfUjhhgtg.f4674Ujhhgtgfeyxiexzf;
            }
            if (!hashSet.equals(this.f4654Ujhhgtgfeyxiexzf)) {
                this.f4654Ujhhgtgfeyxiexzf = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f4651Ujhhgtgfeyxiexzf.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f4653Ujhhgtgfeyxiexzf.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f4653Ujhhgtgfeyxiexzf.put(componentName2, new C1275feyxiexzfUjhhgtg(componentName2));
                    }
                }
                Iterator it = this.f4653Ujhhgtgfeyxiexzf.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg = (C1275feyxiexzfUjhhgtg) entry.getValue();
                        if (c1275feyxiexzfUjhhgtg.f4656Ujhhgtgfeyxiexzf) {
                            this.f4651Ujhhgtgfeyxiexzf.unbindService(this);
                            c1275feyxiexzfUjhhgtg.f4656Ujhhgtgfeyxiexzf = false;
                        }
                        c1275feyxiexzfUjhhgtg.f4657Ujhhgtgfeyxiexzf = null;
                        it.remove();
                    }
                }
            }
            for (C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg2 : this.f4653Ujhhgtgfeyxiexzf.values()) {
                c1275feyxiexzfUjhhgtg2.f4658Ujhhgtgfeyxiexzf.add(c1273feyxiexzfUjhhgtg);
                m2844Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg2);
            }
        } else if (i == 1) {
            C1272feyxiexzfUjhhgtg c1272feyxiexzfUjhhgtg = (C1272feyxiexzfUjhhgtg) message.obj;
            ComponentName componentName3 = c1272feyxiexzfUjhhgtg.f4646Ujhhgtgfeyxiexzf;
            IBinder iBinder = c1272feyxiexzfUjhhgtg.f4647Ujhhgtgfeyxiexzf;
            C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg3 = (C1275feyxiexzfUjhhgtg) this.f4653Ujhhgtgfeyxiexzf.get(componentName3);
            if (c1275feyxiexzfUjhhgtg3 != null) {
                int i2 = AbstractBinderC0739Ujhhgtgfeyxiexzf.f3015Ujhhgtgfeyxiexzf;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0740Ujhhgtgfeyxiexzf.f3016Ujhhgtgfeyxiexzf);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0740Ujhhgtgfeyxiexzf)) {
                        C0609Ujhhgtgfeyxiexzf c0609Ujhhgtgfeyxiexzf = new C0609Ujhhgtgfeyxiexzf();
                        c0609Ujhhgtgfeyxiexzf.f2638Ujhhgtgfeyxiexzf = iBinder;
                        interfaceC0740Ujhhgtgfeyxiexzf = c0609Ujhhgtgfeyxiexzf;
                    } else {
                        interfaceC0740Ujhhgtgfeyxiexzf = (InterfaceC0740Ujhhgtgfeyxiexzf) iInterfaceQueryLocalInterface;
                    }
                }
                c1275feyxiexzfUjhhgtg3.f4657Ujhhgtgfeyxiexzf = interfaceC0740Ujhhgtgfeyxiexzf;
                c1275feyxiexzfUjhhgtg3.f4659Ujhhgtgfeyxiexzf = 0;
                m2844Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg3);
                return true;
            }
        } else if (i == 2) {
            C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg4 = (C1275feyxiexzfUjhhgtg) this.f4653Ujhhgtgfeyxiexzf.get((ComponentName) message.obj);
            if (c1275feyxiexzfUjhhgtg4 != null) {
                if (c1275feyxiexzfUjhhgtg4.f4656Ujhhgtgfeyxiexzf) {
                    this.f4651Ujhhgtgfeyxiexzf.unbindService(this);
                    c1275feyxiexzfUjhhgtg4.f4656Ujhhgtgfeyxiexzf = false;
                }
                c1275feyxiexzfUjhhgtg4.f4657Ujhhgtgfeyxiexzf = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg5 = (C1275feyxiexzfUjhhgtg) this.f4653Ujhhgtgfeyxiexzf.get((ComponentName) message.obj);
            if (c1275feyxiexzfUjhhgtg5 != null) {
                m2844Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f4652Ujhhgtgfeyxiexzf.obtainMessage(1, new C1272feyxiexzfUjhhgtg(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f4652Ujhhgtgfeyxiexzf.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2844Ujhhgtgfeyxiexzf(C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg) {
        boolean z;
        ArrayDeque arrayDeque = c1275feyxiexzfUjhhgtg.f4658Ujhhgtgfeyxiexzf;
        ComponentName componentName = c1275feyxiexzfUjhhgtg.f4655Ujhhgtgfeyxiexzf;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c1275feyxiexzfUjhhgtg.f4656Ujhhgtgfeyxiexzf) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f4651Ujhhgtgfeyxiexzf;
            boolean zBindService = context.bindService(component, this, 33);
            c1275feyxiexzfUjhhgtg.f4656Ujhhgtgfeyxiexzf = zBindService;
            if (zBindService) {
                c1275feyxiexzfUjhhgtg.f4659Ujhhgtgfeyxiexzf = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c1275feyxiexzfUjhhgtg.f4656Ujhhgtgfeyxiexzf;
        }
        if (!z || c1275feyxiexzfUjhhgtg.f4657Ujhhgtgfeyxiexzf == null) {
            m2845Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg);
            return;
        }
        while (true) {
            C1273feyxiexzfUjhhgtg c1273feyxiexzfUjhhgtg = (C1273feyxiexzfUjhhgtg) arrayDeque.peek();
            if (c1273feyxiexzfUjhhgtg == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c1273feyxiexzfUjhhgtg);
                }
                c1273feyxiexzfUjhhgtg.m2843Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg.f4657Ujhhgtgfeyxiexzf);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m2845Ujhhgtgfeyxiexzf(c1275feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2845Ujhhgtgfeyxiexzf(C1275feyxiexzfUjhhgtg c1275feyxiexzfUjhhgtg) {
        ComponentName componentName = c1275feyxiexzfUjhhgtg.f4655Ujhhgtgfeyxiexzf;
        ArrayDeque arrayDeque = c1275feyxiexzfUjhhgtg.f4658Ujhhgtgfeyxiexzf;
        Handler handler = this.f4652Ujhhgtgfeyxiexzf;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c1275feyxiexzfUjhhgtg.f4659Ujhhgtgfeyxiexzf;
        int i2 = i + 1;
        c1275feyxiexzfUjhhgtg.f4659Ujhhgtgfeyxiexzf = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c1275feyxiexzfUjhhgtg.f4659Ujhhgtgfeyxiexzf + " retries");
        arrayDeque.clear();
    }
}
