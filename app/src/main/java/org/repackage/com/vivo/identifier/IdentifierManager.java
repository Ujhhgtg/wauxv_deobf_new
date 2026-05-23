package org.repackage.com.vivo.identifier;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IdentifierManager {
    public static boolean a(Context context) {
        if (IdentifierIdClient.b(context) == null) {
            return false;
        }
        return IdentifierIdClient.a();
    }

    public static String b(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.c();
    }

    public static String c(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.d();
    }

    public static String d(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.e();
    }

    public static String e(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.f();
    }

    public static String f(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.g();
    }

    public static String g(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.h();
    }

    public static String h(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.b();
    }

    public static String i(Context context) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.i();
    }

    public static String j(Context context) {
        IdentifierIdClient identifierIdClientA = IdentifierIdClient.a(context);
        if (identifierIdClientA == null) {
            return null;
        }
        return identifierIdClientA.j();
    }

    public static String k(Context context) {
        IdentifierIdClient identifierIdClientA = IdentifierIdClient.a(context);
        if (identifierIdClientA == null) {
            return null;
        }
        return identifierIdClientA.k();
    }

    public static boolean a(Context context, List<String> list) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return false;
        }
        return identifierIdClientB.a(list);
    }

    public static List b(Context context, List<String> list) {
        IdentifierIdClient identifierIdClientB = IdentifierIdClient.b(context);
        if (identifierIdClientB == null) {
            return null;
        }
        return identifierIdClientB.b(list);
    }
}
