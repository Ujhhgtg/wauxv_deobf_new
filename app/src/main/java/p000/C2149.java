package p000;

import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NoCacheException;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2149 implements Interceptor {

    public static final C2149 f7100 = new C2149();

    public static void m3955(Interceptor.Chain chain) {
        AbstractC2140.f7083.add(new WeakReference(chain.call()));
    }

    public static void m3956(Interceptor.Chain chain) {
        Iterator it = AbstractC2140.f7083.iterator();
        while (it.hasNext()) {
            Call call = (Call) ((WeakReference) it.next()).get();
            if (call == null) {
                it.remove();
            } else if (call.equals(chain.call())) {
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [okhttp3.Response, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᛸᲀᲁᲇ] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ConnectException connectException;
        Throwable th;
        Response responseProceed;
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        C2152 c2152 = requestBodyBody != null ? new C2152(requestBodyBody, (ConcurrentLinkedQueue) request.tag(AbstractC2212.class)) : null;
        C1391 c1391 = (C1391) request.tag(C1391.class);
        ?? r1 = c1391;
        if (c1391 == null) {
            r1 = AbstractC2140.f7080;
        }
        EnumC0544 enumC0544 = (EnumC0544) request.tag(EnumC0544.class);
        Request.Builder builderNewBuilder = request.newBuilder();
        if (r1 != 0 && enumC0544 != null) {
            builderNewBuilder.cacheControl(new CacheControl.Builder().noCache().noStore().build());
        }
        Request requestBuild = builderNewBuilder.method(request.method(), c2152).build();
        try {
            try {
                try {
                    m3955(chain);
                    if (r1 != 0) {
                        int i = enumC0544 == null ? -1 : AbstractC2147.f7098[enumC0544.ordinal()];
                        if (i == 1) {
                            responseProceed = r1.m3102(requestBuild);
                            if (responseProceed == null) {
                                throw new NoCacheException(requestBuild, null, null, 6, null);
                            }
                        } else if (i == 2) {
                            responseProceed = r1.m3102(requestBuild);
                            if (responseProceed == null) {
                                responseProceed = r1.m3103(chain.proceed(requestBuild));
                            }
                        } else if (i != 3) {
                            responseProceed = i != 4 ? chain.proceed(requestBuild) : r1.m3103(chain.proceed(requestBuild));
                        } else {
                            try {
                                responseProceed = r1.m3103(chain.proceed(requestBuild));
                            } catch (Exception unused) {
                                responseProceed = r1.m3102(requestBuild);
                                if (responseProceed == null) {
                                    throw new NoCacheException(requestBuild, null, null, 6, null);
                                }
                            }
                        }
                    } else {
                        responseProceed = chain.proceed(requestBuild);
                    }
                    Response response = responseProceed;
                    try {
                        ResponseBody responseBodyBody = response.body();
                        Response responseBuild = response.newBuilder().body(responseBodyBody != null ? new C2155(responseBodyBody, (ConcurrentLinkedQueue) requestBuild.tag(AbstractC2208.class), new C2148(chain)) : null).build();
                        if ((responseBuild != null ? responseBuild.body() : null) == null) {
                            m3956(chain);
                        }
                        return responseBuild;
                    } catch (NetException e) {
                        throw e;
                    } catch (ConnectException e2) {
                        connectException = e2;
                        throw new NetConnectException(requestBuild, null, connectException, 2, null);
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        throw new NetSocketTimeoutException(requestBuild, e.getMessage(), e);
                    } catch (UnknownHostException e4) {
                        e = e4;
                        throw new NetUnknownHostException(requestBuild, e.getMessage(), null, 4, null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw new HttpFailureException(requestBuild, null, th, 2, null);
                    }
                } catch (Throwable th3) {
                    if ((r1 != 0 ? r1.body() : null) == null) {
                        m3956(chain);
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (NetException e5) {
            throw e5;
        } catch (ConnectException e6) {
            connectException = e6;
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (UnknownHostException e8) {
            e = e8;
        }
    }
}
