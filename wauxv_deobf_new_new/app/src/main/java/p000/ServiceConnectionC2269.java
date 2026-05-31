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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2269 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f7368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Handler f7369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final HashMap f7370 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public HashSet f7371 = new HashSet();

    public ServiceConnectionC2269(Context context) {
        this.f7368 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f7369 = new Handler(handlerThread.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        InterfaceC1609 interfaceC1609 = null;
        if (i == 0) {
            C2266 c2266 = (C2266) message.obj;
            String string = Settings.Secure.getString(this.f7368.getContentResolver(), "enabled_notification_listeners");
            synchronized (C2270.f7372) {
                if (string != null) {
                    try {
                        if (!string.equals(C2270.f7373)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            C2270.f7374 = hashSet2;
                            C2270.f7373 = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = C2270.f7374;
            }
            if (!hashSet.equals(this.f7371)) {
                this.f7371 = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f7368.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                    if (!this.f7370.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f7370.put(componentName2, new C2268(componentName2));
                    }
                }
                Iterator it = this.f7370.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C2268 c2268 = (C2268) entry.getValue();
                        if (c2268.f7364) {
                            this.f7368.unbindService(this);
                            c2268.f7364 = false;
                        }
                        c2268.f7365 = null;
                        it.remove();
                    }
                }
            }
            for (C2268 c2269 : this.f7370.values()) {
                c2269.f7366.add(c2266);
                m4275(c2269);
            }
        } else if (i == 1) {
            C2267 c2267 = (C2267) message.obj;
            ComponentName componentName3 = c2267.f7361;
            IBinder iBinder = c2267.f7362;
            C2268 c22610 = (C2268) this.f7370.get(componentName3);
            if (c22610 != null) {
                int i2 = AbstractBinderC1608.f5507;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1609.f5508);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1609)) {
                        C1607 c1607 = new C1607();
                        c1607.f5506 = iBinder;
                        interfaceC1609 = c1607;
                    } else {
                        interfaceC1609 = (InterfaceC1609) iInterfaceQueryLocalInterface;
                    }
                }
                c22610.f7365 = interfaceC1609;
                c22610.f7367 = 0;
                m4275(c22610);
                return true;
            }
        } else if (i == 2) {
            C2268 c22611 = (C2268) this.f7370.get((ComponentName) message.obj);
            if (c22611 != null) {
                if (c22611.f7364) {
                    this.f7368.unbindService(this);
                    c22611.f7364 = false;
                }
                c22611.f7365 = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C2268 c22612 = (C2268) this.f7370.get((ComponentName) message.obj);
            if (c22612 != null) {
                m4275(c22612);
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
        this.f7369.obtainMessage(1, new C2267(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f7369.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4275(C2268 c2268) {
        boolean z;
        ArrayDeque arrayDeque = c2268.f7366;
        ComponentName componentName = c2268.f7363;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c2268.f7364) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f7368;
            boolean zBindService = context.bindService(component, this, 33);
            c2268.f7364 = zBindService;
            if (zBindService) {
                c2268.f7367 = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c2268.f7364;
        }
        if (!z || c2268.f7365 == null) {
            m4276(c2268);
            return;
        }
        while (true) {
            C2266 c2266 = (C2266) arrayDeque.peek();
            if (c2266 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c2266);
                }
                c2266.m4274(c2268.f7365);
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
        m4276(c2268);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4276(C2268 c2268) {
        ComponentName componentName = c2268.f7363;
        ArrayDeque arrayDeque = c2268.f7366;
        Handler handler = this.f7369;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c2268.f7367;
        int i2 = i + 1;
        c2268.f7367 = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c2268.f7367 + " retries");
        arrayDeque.clear();
    }
}
