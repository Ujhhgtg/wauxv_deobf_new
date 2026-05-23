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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2238 implements Handler.Callback, ServiceConnection {

    public final Context f7248;

    public final Handler f7249;

    public final HashMap f7250 = new HashMap();

    public HashSet f7251 = new HashSet();

    public ServiceConnectionC2238(Context context) {
        this.f7248 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f7249 = new Handler(handlerThread.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC1597 interfaceC1597 = null;
        if (i == 0) {
            C2235 c2235 = (C2235) message.obj;
            String string = Settings.Secure.getString(this.f7248.getContentResolver(), "enabled_notification_listeners");
            synchronized (C2239.f7252) {
                if (string != null) {
                    try {
                        if (!string.equals(C2239.f7253)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            C2239.f7254 = hashSet2;
                            C2239.f7253 = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = C2239.f7254;
            }
            if (!hashSet.equals(this.f7251)) {
                this.f7251 = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f7248.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f7250.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f7250.put(componentName2, new C2237(componentName2));
                    }
                }
                Iterator it = this.f7250.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C2237 c2237 = (C2237) entry.getValue();
                        if (c2237.f7244) {
                            this.f7248.unbindService(this);
                            c2237.f7244 = false;
                        }
                        c2237.f7245 = null;
                        it.remove();
                    }
                }
            }
            for (C2237 c2238 : this.f7250.values()) {
                c2238.f7246.add(c2235);
                m4146(c2238);
            }
        } else if (i == 1) {
            C2236 c2236 = (C2236) message.obj;
            ComponentName componentName3 = c2236.f7241;
            IBinder iBinder = c2236.f7242;
            C2237 c2239 = (C2237) this.f7250.get(componentName3);
            if (c2239 != null) {
                int i2 = 0;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1597.f5474);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1597)) {
                        C1595 c1595 = new C1595();
                        c1595.f5472 = iBinder;
                        interfaceC1597 = c1595;
                    } else {
                        interfaceC1597 = (InterfaceC1597) iInterfaceQueryLocalInterface;
                    }
                }
                c2239.f7245 = interfaceC1597;
                c2239.f7247 = 0;
                m4146(c2239);
                return true;
            }
        } else if (i == 2) {
            C2237 c22310 = (C2237) this.f7250.get((ComponentName) message.obj);
            if (c22310 != null) {
                if (c22310.f7244) {
                    this.f7248.unbindService(this);
                    c22310.f7244 = false;
                }
                c22310.f7245 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C2237 c22311 = (C2237) this.f7250.get((ComponentName) message.obj);
            if (c22311 != null) {
                m4146(c22311);
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
        this.f7249.obtainMessage(1, new C2236(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f7249.obtainMessage(2, componentName).sendToTarget();
    }

    public final void m4146(C2237 c2237) {
        boolean z;
        ArrayDeque arrayDeque = c2237.f7246;
        ComponentName componentName = c2237.f7243;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c2237.f7244) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f7248;
            boolean zBindService = context.bindService(component, this, 33);
            c2237.f7244 = zBindService;
            if (zBindService) {
                c2237.f7247 = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c2237.f7244;
        }
        if (!z || c2237.f7245 == null) {
            m4147(c2237);
            return;
        }
        while (true) {
            C2235 c2235 = (C2235) arrayDeque.peek();
            if (c2235 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c2235);
                }
                c2235.m4145(c2237.f7245);
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
        m4147(c2237);
    }

    public final void m4147(C2237 c2237) {
        ComponentName componentName = c2237.f7243;
        ArrayDeque arrayDeque = c2237.f7246;
        Handler handler = this.f7249;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c2237.f7247;
        int i2 = i + 1;
        c2237.f7247 = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c2237.f7247 + " retries");
        arrayDeque.clear();
    }
}
