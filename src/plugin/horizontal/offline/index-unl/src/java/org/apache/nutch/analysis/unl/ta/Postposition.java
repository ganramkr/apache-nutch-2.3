package org.apache.nutch.analysis.unl.ta;
//import org.apache.nutch.unl.utils.*;

import java.util.Stack;

public class Postposition {

    static ByteMeth ByteMeth;
    static String x = "";
    static Stack originalStack;

    public static boolean check(Stack s) {
        //System.out.println("Postposition check method");
        int flag = 0;
        byte[] topElmt = ((Entry) s.peek()).getPart();
        byte[] oldTopElmt = topElmt;

        //System.out.println("postposition method "+UnicodeConverter.revert(topElmt));
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "PP all");

        //thAn
        if (ByteMeth.endsWith(topElmt, Constant.thAn)) {
            if (ByteMeth.endsWith(topElmt, Constant.kaiyilEthAn)
                    || ByteMeth.endsWith(topElmt, Constant.enRuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.pattavaithAn)
                    || ByteMeth.endsWith(topElmt, Constant.athuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.EthAn)
                    || ByteMeth.endsWith(topElmt, Constant.ukkuththAn)
                    || ByteMeth.endsWith(topElmt, Constant.kaLthAn)
                    || ByteMeth.endsWith(topElmt, Constant.enpathuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.ilthAn)
                    || ByteMeth.endsWith(topElmt, Constant.pOthuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.mIthuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.umthAn)
                    || ByteMeth.endsWith(topElmt, Constant.patithAn)
                    || ByteMeth.endsWith(topElmt, Constant.uLthAn)
                    || ByteMeth.endsWith(topElmt, Constant.maithAn)
                    || ByteMeth.endsWith(topElmt, Constant.ithAn)
                    || ByteMeth.endsWith(topElmt, Constant.AkaththAn)
                    || ByteMeth.endsWith(topElmt, Constant.nthAn)
                    || ByteMeth.endsWith(topElmt, Constant.AlthAn)
                    || ByteMeth.endsWith(topElmt, Constant.AththAn)
                    || ByteMeth.endsWith(topElmt, Constant.uthAn)
                    || ByteMeth.endsWith(topElmt, Constant.athaiththAn)
                    || ByteMeth.endsWith(topElmt, Constant.kaLiththAn)
                    || ByteMeth.endsWith(topElmt, Constant.vittuththAn)
                    || ByteMeth.endsWith(topElmt, Constant.pOlthAn)){
                //System.out.println("Postposition check method 1");
                //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thAn");
                s.pop();
                s.push(new Entry(Constant.thAn, Tag.PostpositionBound));
                topElmt = ByteMeth.subArray(topElmt, 0,
                        topElmt.length - Constant.thAn.length);
                s.push(new Entry(topElmt, -1, oldTopElmt));
                flag = 1;
            }
        }

        // thottu
        if (ByteMeth.endsWith(topElmt, Constant.thottu)) {
            //System.out.println("Postposition check method 2");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thottu");
            s.pop();
            s.push(new Entry(Constant.thottu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thottu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }

        if (ByteMeth.endsWith(topElmt, Constant.kUdiya)) {
            //System.out.println("Postposition check method 2");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thottu");
            s.pop();
            s.push(new Entry(Constant.kUdiya, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kUdiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // mARu
        if (ByteMeth.endsWith(topElmt, Constant.mARu)) {
            //System.out.println("Postposition check method 3");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mARu");
            s.pop();
            s.push(new Entry(Constant.mARu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - (Constant.mARu.length - 1));
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // muthal
        if (ByteMeth.endsWith(topElmt, Constant.muthal)) {
            //System.out.println("Postposition check method 4");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "muthal");
            s.pop();
            s.push(new Entry(Constant.muthal, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.muthal.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vasam
        if (ByteMeth.endsWith(topElmt, Constant.vasam)) {
            //System.out.println("Postposition check method 5");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vasam");
            s.pop();
            s.push(new Entry(Constant.vasam, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vasam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // later
	/*	// varai
        if(ByteMeth.endsWith(topElmt,Constant.varai) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.Ana,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.iya,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.uLLa,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.aRRa,Constant.varai)))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "varai");
        s.pop();
        s.push(new Entry(Constant.varai,Tag.PostpositionBound));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.varai.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        return true;
        }*/
        // varaiyil
        if (ByteMeth.endsWith(topElmt, Constant.varaiyil)) {
            //System.out.println("Postposition check method 6");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "varaiyil");
            s.pop();
            s.push(new Entry(Constant.varaiyil, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.varaiyil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // varaikkum
        if (ByteMeth.endsWith(topElmt, Constant.varaikkum)) {
            //System.out.println("Postposition check method 7");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "varaikkum");
            s.pop();
            s.push(new Entry(Constant.varaikkum, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.varaikkum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // thORum
        if (ByteMeth.endsWith(topElmt, Constant.thORum)) {
            //System.out.println("Postposition check method 8");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thORum");
            s.pop();
            s.push(new Entry(Constant.thORum, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thORum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // otti
        if (ByteMeth.endsWith(topElmt, Constant.otti)) {
            //System.out.println("Postposition check method 9");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "otti");
            s.pop();
            s.push(new Entry(Constant.otti, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.otti.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            return true;
        }

        // ottiya
        if (ByteMeth.endsWith(topElmt, Constant.ottiya)) {
            //System.out.println("Postposition check method 10");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ottiya");
            s.pop();
            s.push(new Entry(Constant.ottiya, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ottiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            return true;
        }
        // kaiyil
		/*if (ByteMeth.endsWith(topElmt, Constant.kaiyil))
        if (
        (ByteMeth.endsWith(topElmt, Constant.kaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.vAzkkaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.thokaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.mALikaiyil))
        ) */
        if (ByteMeth.endsWith(topElmt, Constant.kaiyil)) {
            //System.out.println("Postposition check method 11");
            //System.out.println("value of top at " + UnicodeConverter.revert(topElmt));
            if (!((ByteMeth.startsWith(topElmt, Constant.vAzk))
                    || (ByteMeth.startsWith(topElmt, Constant.mALi))
                    || (ByteMeth.startsWith(topElmt, Constant.iyaR))
                    || (ByteMeth.startsWith(topElmt, Constant.kang))
                    || (ByteMeth.startsWith(topElmt, Constant.tho)))) {
                //System.out.println("value of to " + UnicodeConverter.revert(topElmt));
                //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kaiyil");
                s.pop();
                s.push(new Entry(Constant.kaiyil, Tag.PostpositionBound));
                topElmt = ByteMeth.subArray(topElmt, 0,
                        topElmt.length - Constant.kaiyil.length);
                s.push(new Entry(topElmt, -1, oldTopElmt));
                Sandhi.k(s);
                return true;
            }

        }
        // kAttilum
        if (ByteMeth.endsWith(topElmt, Constant.kAttilum)) {
            //System.out.println("Postposition check method 12");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kAttilum");
            s.pop();
            s.push(new Entry(Constant.kAttilum, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kAttilum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // munnittu
        if (ByteMeth.endsWith(topElmt, Constant.munnittu)) {
            //System.out.println("Postposition check method 13");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munnittu");
            s.pop();
            s.push(new Entry(Constant.munnittu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munnittu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vita
        if (ByteMeth.endsWith(topElmt, Constant.vita)) {
            //System.out.println("Postposition check method 14");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vita");
            s.pop();
            s.push(new Entry(Constant.vita, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vita.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vittu
        if (ByteMeth.endsWith(topElmt, Constant.vittu)
                && !ByteMeth.isEqual(topElmt, Constant.kaivittu)) {
            //System.out.println("Postposition check method 15");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vittu");
            s.pop();
            s.push(new Entry(Constant.vittu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vittu.length);
            if (ByteMeth.endsWith(topElmt, Constant.thara)) {
                topElmt = ByteMeth.addArray(topElmt, Constant.vu);
            }
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // suRRi
        if (ByteMeth.endsWith(topElmt, Constant.suRRi)) {
             //System.out.println("Postposition check method 16");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "suRRi");
            s.pop();
            s.push(new Entry(Constant.suRRi, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.suRRi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.s(s);
            return true;
        }
        // appAl
        if (ByteMeth.endsWith(topElmt, Constant.appAl)) {
             //System.out.println("Postposition check method 17");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "appAl");
            s.pop();
            s.push(new Entry(Constant.appAl, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.appAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // appuRam
        if (ByteMeth.endsWith(topElmt, Constant.appuRam)) {
             //System.out.println("Postposition check method 18");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "appuRam");
            s.pop();
            s.push(new Entry(Constant.appuRam, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.appuRam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // n_igarAka
        if (ByteMeth.endsWith(topElmt, Constant.n_igarAka)) {
             //System.out.println("Postposition check method 19");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_igarAka");
            s.pop();
            s.push(new Entry(Constant.n_igarAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_igarAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // ERpa
        if (ByteMeth.endsWith(topElmt, Constant.ERpa)) {
             //System.out.println("Postposition check method 20");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ERpa");
            s.pop();
            s.push(new Entry(Constant.ERpa, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ERpa.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // n_ikar
        if (ByteMeth.endsWith(topElmt, Constant.n_ikar)) {
             //System.out.println("Postposition check method 21");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_ikar");
            s.pop();
            s.push(new Entry(Constant.n_ikar, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_ikar.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // munpu
        if (ByteMeth.endsWith(topElmt, Constant.munpu)) {
             //System.out.println("Postposition check method 22");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munpu");
            s.pop();
            s.push(new Entry(Constant.munpu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munpu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // mERpatta
        if (ByteMeth.endsWith(topElmt, Constant.mERpatta)) {
             //System.out.println("Postposition check method 23");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mERpatta");
            s.pop();
            s.push(new Entry(Constant.mERpatta, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mERpatta.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // bathilAka
        if (ByteMeth.endsWith(topElmt, Constant.bathilAka)) {
             //System.out.println("Postposition check method 24");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "bathilAka");
            s.pop();
            s.push(new Entry(Constant.bathilAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.bathilAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // viLaivAka
        if (ByteMeth.endsWith(topElmt, Constant.viLaivAka)) {
            //System.out.println("Postposition check method 25");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "viLaivAka");
            s.pop();
            s.push(new Entry(Constant.viLaivAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.viLaivAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // pEril
        if (ByteMeth.endsWith(topElmt, Constant.pEril)) {
            //System.out.println("Postposition check method 26");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pEril");
            s.pop();
            s.push(new Entry(Constant.pEril, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pEril.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // pOthu
        if (ByteMeth.endsWith(topElmt, Constant.pOthu)) {
            //System.out.println("Postposition check method 27");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOthu");
            s.pop();
            s.push(new Entry(Constant.pOthu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //pOthilum
        if (ByteMeth.endsWith(topElmt, Constant.pothilum)) {
            //System.out.println("Postposition check method 28");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pothilum");
            s.pop();
            s.push(new Entry(Constant.pothilum, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pothilum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

        // pozuthu
        if (ByteMeth.endsWith(topElmt, Constant.pozuthu)) {
            //System.out.println("Postposition check method 29");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pozuthu");
            s.pop();
            s.push(new Entry(Constant.pozuthu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pozuthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // irun_thu
        if (ByteMeth.endsWith(topElmt, Constant.irun_thu)) {
            //System.out.println("Postposition check method 30");
            ////System.out.println("Post posting Irun_thu true");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "irun_thu");
            s.pop();
            s.push(new Entry(Constant.irun_thu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.irun_thu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            Sandhi.type4(s);
            return true;
        }
        // kuRiththu
        if (ByteMeth.endsWith(topElmt, Constant.kuRiththu)) {
            //System.out.println("Postposition check method 31");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRiththu");
            s.pop();
            s.push(new Entry(Constant.kuRiththu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRiththu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // thakkathu
        if (ByteMeth.endsWith(topElmt, Constant.thakkathu)) {
            //System.out.println("Postposition check method 32");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thakkathu");
            s.pop();
            s.push(new Entry(Constant.thakkathu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thakkathu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.th(s);
            return true;
        }
        // thavira
        if (ByteMeth.endsWith(topElmt, Constant.thavira)) {
            //System.out.println("Postposition check method 33");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thavira");
            s.pop();
            s.push(new Entry(Constant.thavira, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thavira.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.th(s);
            return true;
        }
        // paRRi
        if (ByteMeth.endsWith(topElmt, Constant.paRRi)) {
            //System.out.println("Postposition check method 34");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "paRRi");
            s.pop();
            s.push(new Entry(Constant.paRRi, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.paRRi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // pOl
        if (ByteMeth.endsWith(topElmt, Constant.pOl)) {
            //System.out.println("Postposition check method 35");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOl");
            s.pop();
            s.push(new Entry(Constant.pOl, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // pOla
        if (ByteMeth.endsWith(topElmt, Constant.pOla)) {
            //System.out.println("Postposition check method 36");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOla");
            s.pop();
            s.push(new Entry(Constant.pOla, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOla.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        //EyAnAl
        if (ByteMeth.endsWith(topElmt, Constant.EyAnAl)) {
            //System.out.println("Postposition check method 37");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "EyAnAl");
            s.pop();
            s.push(new Entry(Constant.EyAnAl, Tag.ConjunctionSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.EyAnAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // AnAl
        if (ByteMeth.endsWith(topElmt, Constant.AnAl)) {
            //System.out.println("Postposition check method 38");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "AnAl");
            s.pop();
            s.push(new Entry(Constant.AnAl, Tag.ConjunctionSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.AnAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }

        // mAthiri
        if (ByteMeth.endsWith(topElmt, Constant.mAthiri)) {
            //System.out.println("Postposition check method 39");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mAthiri");
            s.pop();
            s.push(new Entry(Constant.mAthiri, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mAthiri.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // kuRiththa
        if (ByteMeth.endsWith(topElmt, Constant.kuRiththa)) {
            //System.out.println("Postposition check method 40");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRiththa");
            s.pop();
            s.push(new Entry(Constant.kuRiththa, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRiththa.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // paRRiya
        if (ByteMeth.endsWith(topElmt, Constant.paRRiya)) {
            //System.out.println("Postposition check method 41");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "paRRiya");
            s.pop();
            s.push(new Entry(Constant.paRRiya, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.paRRiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // vaiththu
        if (ByteMeth.endsWith(topElmt, Constant.vaiththu)) {
            //System.out.println("Postposition check method 42");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vaiththu");
            s.pop();
            s.push(new Entry(Constant.vaiththu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vaiththu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // n_Okki
        if (ByteMeth.endsWith(topElmt, Constant.n_Okki)) {
            //System.out.println("Postposition check method 43");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_Okki");
            s.pop();
            s.push(new Entry(Constant.n_Okki, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_Okki.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // koNdu
        if (ByteMeth.endsWith(topElmt, Constant.koNdu)) {
            //System.out.println("Postposition check method 44");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "koNdu");
            s.pop();
            s.push(new Entry(Constant.koNdu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.koNdu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // illai
        if (ByteMeth.endsWith(topElmt, Constant.illai)) {
//System.out.println("Postposition check method middle 45");
            s.pop();
            s.push(new Entry(Constant.illai, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0, topElmt.length - Constant.illai.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            ////System.out.println("true");
            return true;
        }
        // allAtha
        if (ByteMeth.endsWith(topElmt, Constant.allAtha)) {
            //System.out.println("Postposition check method 46");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "allAtha");
            s.pop();
            s.push(new Entry(Constant.allAtha, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.allAtha.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // aRRu
        if (ByteMeth.endsWith(topElmt, Constant.aRRu)) {
            //System.out.println("Postposition check method 47");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "aRRu");
            s.pop();
            s.push(new Entry(Constant.aRRu, Tag.NegativeVerbalParticipleSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.aRRu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // alla
        if (ByteMeth.endsWith(topElmt, Constant.alla)) {
            //System.out.println("Postposition check method 48");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "alla");
            s.pop();
            s.push(new Entry(Constant.alla, Tag.NegativeFiniteVerbSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.alla.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // ethirE
        if (ByteMeth.endsWith(topElmt, Constant.ethirE)) {
            //System.out.println("Postposition check method 49");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ethirE");
            s.pop();
            s.push(new Entry(Constant.ethirE, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ethirE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // sArbAka
        if (ByteMeth.endsWith(topElmt, Constant.sArbAka)) {
            //System.out.println("Postposition check method 50");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "sArbAka");
            s.pop();
            s.push(new Entry(Constant.sArbAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.sArbAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // sArbil
        if (ByteMeth.endsWith(topElmt, Constant.sArbil)) {
            //System.out.println("Postposition check method 51");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "sArbil");
            s.pop();
            s.push(new Entry(Constant.sArbil, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.sArbil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

        /*// pAl
        if(ByteMeth.endsWith(topElmt,Constant.pAl) &&
        !ByteMeth.endsWith(topElmt,Constant.appAl))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "pAl");
        s.pop();
        s.push(new Entry(Constant.pAl,Tag.PostpositionBound));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.pAl.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }
         */
        // veLiyE
        if (ByteMeth.endsWith(topElmt, Constant.veLiyE)) {
            //System.out.println("Postposition check method 52");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "veLiyE");
            s.pop();
            s.push(new Entry(Constant.veLiyE, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.veLiyE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // vaziyAka
        if (ByteMeth.endsWith(topElmt, Constant.vaziyAka)) {
            //System.out.println("Postposition check method 53");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vaziyAka");
            s.pop();
            s.push(new Entry(Constant.vaziyAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vaziyAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mUlam
        if (ByteMeth.endsWith(topElmt, Constant.mUlam)) {
            //System.out.println("Postposition check method 54");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mUlam");
            s.pop();
            s.push(new Entry(Constant.mUlam, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mUlam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mUlamAka
        if (ByteMeth.endsWith(topElmt, Constant.mUlamAka)) {
            //System.out.println("Postposition check method 55");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mUlamAka");
            s.pop();
            s.push(new Entry(Constant.mUlamAka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mUlamAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mIthu
        if (ByteMeth.endsWith(topElmt, Constant.mIthu)) {
            //System.out.println("Postposition check method 56");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mIthu");
            s.pop();
            s.push(new Entry(Constant.mIthu, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mIthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // padi
        if (ByteMeth.endsWith(topElmt, Constant.padi)) {
            //System.out.println("Postposition check method 57");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "padi");
            s.pop();
            s.push(new Entry(Constant.padi, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.padi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // udaiya
        if (ByteMeth.endsWith(topElmt, Constant.udaiya)) {
            //System.out.println("Postposition check method 58");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "udaiya");
            s.pop();
            s.push(new Entry(Constant.udaiya, Tag.GenitiveCase));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.udaiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //06-09-06
        // uriya
        if (ByteMeth.endsWith(topElmt, Constant.uriya)) {
            //System.out.println("Postposition check method 59");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uriya");
            s.pop();
            s.push(new Entry(Constant.uriya, Tag.AdjectivalSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uriya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //uriyathu
        if (ByteMeth.endsWith(topElmt, Constant.uriyathu)) {
            //System.out.println("Postposition check method 60");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uriyathu");
            s.pop();
            s.push(new Entry(Constant.uriyathu, Tag.FiniteVerbSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uriyathu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        /*
        //clashes with 'evvaLavukku'
        //aLavukku
        if(ByteMeth.endsWith(topElmt,Constant.aLavukku))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "aLavukku");
        s.pop();
        s.push(new Entry(Constant.aLavukku,Tag.PostpositionBound));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.aLavukku.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }*/

        /*
        //clashes with 'padiyil'
        //adiyil
        if(ByteMeth.endsWith(topElmt,Constant.adiyil))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "adiyil");
        s.pop();
        s.push(new Entry(Constant.adiyil,Tag.PostpositionBound));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.adiyil.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }
         */
        // idaiyil
        if (ByteMeth.endsWith(topElmt, Constant.idaiyil)) {
            //System.out.println("Postposition check method 61");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "idaiyil");
            s.pop();
            s.push(new Entry(Constant.idaiyil, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.idaiyil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // idaiyE
        if (ByteMeth.endsWith(topElmt, Constant.idaiyE)) {
            //System.out.println("Postposition check method 62");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "idaiyE");
            s.pop();
            s.push(new Entry(Constant.idaiyE, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.idaiyE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // utpuRaththil
        if (ByteMeth.endsWith(topElmt, Constant.utpuRaththil)) {
            //System.out.println("Postposition check method 63");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "utpuRaththil");
            s.pop();
            s.push(new Entry(Constant.utpuRaththil, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.utpuRaththil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // utpuRam
        if (ByteMeth.endsWith(topElmt, Constant.utpuRam)) {
            //System.out.println("Postposition check method 64");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "utpuRam");
            s.pop();
            s.push(new Entry(Constant.utpuRam, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.utpuRam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // uL
        if (ByteMeth.endsWith(topElmt, Constant.uL)) {
            //System.out.println("Postposition check method 65");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uL");
            s.pop();
            s.push(new Entry(Constant.uL, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uL.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // kIz
        if (ByteMeth.endsWith(topElmt, Constant.kIz)) {
            //System.out.println("Postposition check method 66");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kIz");
            s.pop();
            s.push(new Entry(Constant.kIz, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kIz.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.k(s);
            return true;
        }
        // kuRukkE
        if (ByteMeth.endsWith(topElmt, Constant.kuRukkE)) {
            //System.out.println("Postposition check method 67");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRukkE");
            s.pop();
            s.push(new Entry(Constant.kuRukkE, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRukkE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.k(s);
            return true;
        }
        // n_aduvil
        if (ByteMeth.endsWith(topElmt, Constant.n_aduvil)) {
            //System.out.println("Postposition check method 68");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_aduvil");
            s.pop();
            s.push(new Entry(Constant.n_aduvil, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_aduvil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // n_aduvE
        if (ByteMeth.endsWith(topElmt, Constant.n_aduvE)) {
            //System.out.println("Postposition check method 69");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_aduvE");
            s.pop();
            s.push(new Entry(Constant.n_aduvE, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_aduvE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

       
        //pin
        if(ByteMeth.endsWith(topElmt,Constant.pin))
        {
            //System.out.println("pin in postpostion 70");
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "pin");
        s.pop();
        s.push(new Entry(Constant.pin,Tag.PostpositionBound));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.pin.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        //Sandhi.postposition(s);
        Sandhi.kctp(s);
        return true;
        }
         
        // mun
        if (ByteMeth.endsWith(topElmt, Constant.mun)) {
            //System.out.println("Postposition check method 71");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mun");
            s.pop();
            s.push(new Entry(Constant.mun, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mun.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // munnar
        if (ByteMeth.endsWith(topElmt, Constant.munnar)) {
            //System.out.println("Postposition check method 72");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munnar");
            s.pop();
            s.push(new Entry(Constant.munnar, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munnar.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mEl
        if (ByteMeth.endsWith(topElmt, Constant.mEl)) {
            //System.out.println("Postposition check method 73");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mEl");
            s.pop();
            s.push(new Entry(Constant.mEl, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mEl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // piRaku
        if (ByteMeth.endsWith(topElmt, Constant.piRaku)) {
            //System.out.println("Postposition check method 74");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "piRaku");
            s.pop();
            s.push(new Entry(Constant.piRaku, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.piRaku.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.p(s);
            return true;
        }
        // Aka
        if (ByteMeth.endsWith(topElmt, Constant.Aka)
                && (ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.iRk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.aRk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.akk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.ukk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.kk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.ath, Constant.Aka)))) {
            //System.out.println("Postposition check method 75");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "Aka");
            s.pop();
            s.push(new Entry(Constant.Aka, Tag.PostpositionBound));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.Aka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }


        if (flag == 1) {
            return true;
        }
//		////System.out.println("9A false");
        return false;
    }

// this method is for checking the input word ends with maan,because incase thondaimaan is queryword means the output like maan <noun>, to avoid this pblm this method is used.
    public static boolean checkExp(Stack s) {
        byte[] topElmt = ((Entry) s.peek()).getPart();
        byte[] oldTopElmt = topElmt;

        if (ByteMeth.endsWith(topElmt, Constant.maan)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "maan");

            return true;
        }
        return false;
    }

    //This method is for checking whenever the verb comes as root then the postpostion need to b changed as particle. //Example துடித்திருந்தபோது.In thisthe word podhu will need to come asparticle instead of postposition

    public static boolean check_Verb(Stack s) {
        //System.out.println("Postposition check method");
        int flag = 0;
        byte[] topElmt = ((Entry) s.peek()).getPart();
        byte[] oldTopElmt = topElmt;

if (ByteMeth.endsWith(topElmt, Constant.thAn)) {
            if (ByteMeth.endsWith(topElmt, Constant.kaiyilEthAn)
                    || ByteMeth.endsWith(topElmt, Constant.enRuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.pattavaithAn)
                    || ByteMeth.endsWith(topElmt, Constant.athuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.EthAn)
                    || ByteMeth.endsWith(topElmt, Constant.ukkuththAn)
                    || ByteMeth.endsWith(topElmt, Constant.kaLthAn)
                    || ByteMeth.endsWith(topElmt, Constant.enpathuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.ilthAn)
                    || ByteMeth.endsWith(topElmt, Constant.pOthuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.mIthuthAn)
                    || ByteMeth.endsWith(topElmt, Constant.umthAn)
                    || ByteMeth.endsWith(topElmt, Constant.patithAn)
                    || ByteMeth.endsWith(topElmt, Constant.uLthAn)
                    || ByteMeth.endsWith(topElmt, Constant.maithAn)
                    || ByteMeth.endsWith(topElmt, Constant.ithAn)
                    || ByteMeth.endsWith(topElmt, Constant.AkaththAn)
                    || ByteMeth.endsWith(topElmt, Constant.nthAn)
                    || ByteMeth.endsWith(topElmt, Constant.AlthAn)
                    || ByteMeth.endsWith(topElmt, Constant.AththAn)
                    || ByteMeth.endsWith(topElmt, Constant.uthAn)
                    || ByteMeth.endsWith(topElmt, Constant.athaiththAn)
                    || ByteMeth.endsWith(topElmt, Constant.kaLiththAn)
                    || ByteMeth.endsWith(topElmt, Constant.vittuththAn)
                    || ByteMeth.endsWith(topElmt, Constant.pOlthAn)) {
                //System.out.println("Postposition check method 1");
                //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thAn");
                s.pop();
                s.push(new Entry(Constant.thAn, Tag.Particle));
                topElmt = ByteMeth.subArray(topElmt, 0,
                        topElmt.length - Constant.thAn.length);
                s.push(new Entry(topElmt, -1, oldTopElmt));
                flag = 1;
            }
        }

        // thottu
        if (ByteMeth.endsWith(topElmt, Constant.thottu)) {
            //System.out.println("Postposition check method 2");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thottu");
            s.pop();
            s.push(new Entry(Constant.thottu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thottu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // mARu
        if (ByteMeth.endsWith(topElmt, Constant.mARu)) {
            //System.out.println("Postposition check method 3");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mARu");
            s.pop();
            s.push(new Entry(Constant.mARu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - (Constant.mARu.length - 1));
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // muthal
        if (ByteMeth.endsWith(topElmt, Constant.muthal)) {
            //System.out.println("Postposition check method 4");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "muthal");
            s.pop();
            s.push(new Entry(Constant.muthal, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.muthal.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vasam
        if (ByteMeth.endsWith(topElmt, Constant.vasam)) {
            //System.out.println("Postposition check method 5");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vasam");
            s.pop();
            s.push(new Entry(Constant.vasam, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vasam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // later
	/*	// varai
        if(ByteMeth.endsWith(topElmt,Constant.varai) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.Ana,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.iya,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.uLLa,Constant.varai)) &&
        !ByteMeth.endsWith(topElmt,ByteMeth.addArray(Constant.aRRa,Constant.varai)))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "varai");
        s.pop();
        s.push(new Entry(Constant.varai,Tag.Particle));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.varai.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        return true;
        }*/
        // varaiyil
        if (ByteMeth.endsWith(topElmt, Constant.varaiyil)) {
            //System.out.println("Postposition check method 6");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "varaiyil");
            s.pop();
            s.push(new Entry(Constant.varaiyil, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.varaiyil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // varaikkum
        if (ByteMeth.endsWith(topElmt, Constant.varaikkum)) {
            //System.out.println("Postposition check method 7");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "varaikkum");
            s.pop();
            s.push(new Entry(Constant.varaikkum, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.varaikkum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // thORum
        if (ByteMeth.endsWith(topElmt, Constant.thORum)) {
            //System.out.println("Postposition check method 8");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thORum");
            s.pop();
            s.push(new Entry(Constant.thORum, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thORum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // otti
        if (ByteMeth.endsWith(topElmt, Constant.otti)) {
            //System.out.println("Postposition check method 9");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "otti");
            s.pop();
            s.push(new Entry(Constant.otti, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.otti.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            return true;
        }

        // ottiya
        if (ByteMeth.endsWith(topElmt, Constant.ottiya)) {
            //System.out.println("Postposition check method 10");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ottiya");
            s.pop();
            s.push(new Entry(Constant.ottiya, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ottiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            return true;
        }
        // kaiyil
		/*if (ByteMeth.endsWith(topElmt, Constant.kaiyil))
        if (
        (ByteMeth.endsWith(topElmt, Constant.kaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.vAzkkaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.thokaiyil))||
        !(ByteMeth.isEqual(topElmt, Constant.mALikaiyil))
        ) */
        if (ByteMeth.endsWith(topElmt, Constant.kaiyil)) {
            //System.out.println("Postposition check method 11");
            //System.out.println("value of top at " + UnicodeConverter.revert(topElmt));
            if (!((ByteMeth.startsWith(topElmt, Constant.vAzk))
                    || (ByteMeth.startsWith(topElmt, Constant.mALi))
                    || (ByteMeth.startsWith(topElmt, Constant.iyaR))
                    || (ByteMeth.startsWith(topElmt, Constant.kang))
                    || (ByteMeth.startsWith(topElmt, Constant.tho)))) {
                //System.out.println("value of to " + UnicodeConverter.revert(topElmt));
                //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kaiyil");
                s.pop();
                s.push(new Entry(Constant.kaiyil, Tag.Particle));
                topElmt = ByteMeth.subArray(topElmt, 0,
                        topElmt.length - Constant.kaiyil.length);
                s.push(new Entry(topElmt, -1, oldTopElmt));
                Sandhi.k(s);
                return true;
            }

        }
        // kAttilum
        if (ByteMeth.endsWith(topElmt, Constant.kAttilum)) {
            //System.out.println("Postposition check method 12");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kAttilum");
            s.pop();
            s.push(new Entry(Constant.kAttilum, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kAttilum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // munnittu
        if (ByteMeth.endsWith(topElmt, Constant.munnittu)) {
            //System.out.println("Postposition check method 13");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munnittu");
            s.pop();
            s.push(new Entry(Constant.munnittu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munnittu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vita
        if (ByteMeth.endsWith(topElmt, Constant.vita)) {
            //System.out.println("Postposition check method 14");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vita");
            s.pop();
            s.push(new Entry(Constant.vita, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vita.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // vittu
        if (ByteMeth.endsWith(topElmt, Constant.vittu)
                && !ByteMeth.isEqual(topElmt, Constant.kaivittu)) {
            //System.out.println("Postposition check method 15");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vittu");
            s.pop();
            s.push(new Entry(Constant.vittu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vittu.length);
            if (ByteMeth.endsWith(topElmt, Constant.thara)) {
                topElmt = ByteMeth.addArray(topElmt, Constant.vu);
            }
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // suRRi
        if (ByteMeth.endsWith(topElmt, Constant.suRRi)) {
             //System.out.println("Postposition check method 16");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "suRRi");
            s.pop();
            s.push(new Entry(Constant.suRRi, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.suRRi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.s(s);
            return true;
        }
        // appAl
        if (ByteMeth.endsWith(topElmt, Constant.appAl)) {
             //System.out.println("Postposition check method 17");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "appAl");
            s.pop();
            s.push(new Entry(Constant.appAl, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.appAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // appuRam
        if (ByteMeth.endsWith(topElmt, Constant.appuRam)) {
             //System.out.println("Postposition check method 18");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "appuRam");
            s.pop();
            s.push(new Entry(Constant.appuRam, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.appuRam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // n_igarAka
        if (ByteMeth.endsWith(topElmt, Constant.n_igarAka)) {
             //System.out.println("Postposition check method 19");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_igarAka");
            s.pop();
            s.push(new Entry(Constant.n_igarAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_igarAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // ERpa
        if (ByteMeth.endsWith(topElmt, Constant.ERpa)) {
             //System.out.println("Postposition check method 20");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ERpa");
            s.pop();
            s.push(new Entry(Constant.ERpa, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ERpa.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }
        // n_ikar
        if (ByteMeth.endsWith(topElmt, Constant.n_ikar)) {
             //System.out.println("Postposition check method 21");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_ikar");
            s.pop();
            s.push(new Entry(Constant.n_ikar, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_ikar.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // munpu
        if (ByteMeth.endsWith(topElmt, Constant.munpu)) {
             //System.out.println("Postposition check method 22");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munpu");
            s.pop();
            s.push(new Entry(Constant.munpu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munpu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // mERpatta
        if (ByteMeth.endsWith(topElmt, Constant.mERpatta)) {
             //System.out.println("Postposition check method 23");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mERpatta");
            s.pop();
            s.push(new Entry(Constant.mERpatta, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mERpatta.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // bathilAka
        if (ByteMeth.endsWith(topElmt, Constant.bathilAka)) {
             //System.out.println("Postposition check method 24");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "bathilAka");
            s.pop();
            s.push(new Entry(Constant.bathilAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.bathilAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // viLaivAka
        if (ByteMeth.endsWith(topElmt, Constant.viLaivAka)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "viLaivAka");
            s.pop();
            s.push(new Entry(Constant.viLaivAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.viLaivAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // pEril
        if (ByteMeth.endsWith(topElmt, Constant.pEril)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pEril");
            s.pop();
            s.push(new Entry(Constant.pEril, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pEril.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // pOthu
        if (ByteMeth.endsWith(topElmt, Constant.pOthu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOthu");
            s.pop();
            s.push(new Entry(Constant.pOthu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //pOthilum
        if (ByteMeth.endsWith(topElmt, Constant.pothilum)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pothilum");
            s.pop();
            s.push(new Entry(Constant.pothilum, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pothilum.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

        // pozuthu
        if (ByteMeth.endsWith(topElmt, Constant.pozuthu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pozuthu");
            s.pop();
            s.push(new Entry(Constant.pozuthu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pozuthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // irun_thu
        if (ByteMeth.endsWith(topElmt, Constant.irun_thu)) {
            ////System.out.println("Post posting Irun_thu true");
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "irun_thu");
            s.pop();
            s.push(new Entry(Constant.irun_thu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.irun_thu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type2(s);
            Sandhi.type4(s);
            return true;
        }
        // kuRiththu
        if (ByteMeth.endsWith(topElmt, Constant.kuRiththu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRiththu");
            s.pop();
            s.push(new Entry(Constant.kuRiththu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRiththu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // thakkathu
        if (ByteMeth.endsWith(topElmt, Constant.thakkathu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thakkathu");
            s.pop();
            s.push(new Entry(Constant.thakkathu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thakkathu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.th(s);
            return true;
        }
        // thavira
        if (ByteMeth.endsWith(topElmt, Constant.thavira)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "thavira");
            s.pop();
            s.push(new Entry(Constant.thavira, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.thavira.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.th(s);
            return true;
        }
        // paRRi
        if (ByteMeth.endsWith(topElmt, Constant.paRRi)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "paRRi");
            s.pop();
            s.push(new Entry(Constant.paRRi, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.paRRi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // pOl
        if (ByteMeth.endsWith(topElmt, Constant.pOl)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOl");
            s.pop();
            s.push(new Entry(Constant.pOl, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // pOla
        if (ByteMeth.endsWith(topElmt, Constant.pOla)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "pOla");
            s.pop();
            s.push(new Entry(Constant.pOla, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.pOla.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        //EyAnAl
        if (ByteMeth.endsWith(topElmt, Constant.EyAnAl)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "EyAnAl");
            s.pop();
            s.push(new Entry(Constant.EyAnAl, Tag.ConjunctionSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.EyAnAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // AnAl
        if (ByteMeth.endsWith(topElmt, Constant.AnAl)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "AnAl");
            s.pop();
            s.push(new Entry(Constant.AnAl, Tag.ConjunctionSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.AnAl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }

        // mAthiri
        if (ByteMeth.endsWith(topElmt, Constant.mAthiri)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mAthiri");
            s.pop();
            s.push(new Entry(Constant.mAthiri, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mAthiri.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // kuRiththa
        if (ByteMeth.endsWith(topElmt, Constant.kuRiththa)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRiththa");
            s.pop();
            s.push(new Entry(Constant.kuRiththa, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRiththa.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // paRRiya
        if (ByteMeth.endsWith(topElmt, Constant.paRRiya)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "paRRiya");
            s.pop();
            s.push(new Entry(Constant.paRRiya, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.paRRiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.p(s);
            return true;
        }
        // vaiththu
        if (ByteMeth.endsWith(topElmt, Constant.vaiththu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vaiththu");
            s.pop();
            s.push(new Entry(Constant.vaiththu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vaiththu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // n_Okki
        if (ByteMeth.endsWith(topElmt, Constant.n_Okki)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_Okki");
            s.pop();
            s.push(new Entry(Constant.n_Okki, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_Okki.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            return true;
        }
        // koNdu
        if (ByteMeth.endsWith(topElmt, Constant.koNdu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "koNdu");
            s.pop();
            s.push(new Entry(Constant.koNdu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.koNdu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.k(s);
            return true;
        }
        // illai
        if (ByteMeth.endsWith(topElmt, Constant.illai)) {

            s.pop();
            s.push(new Entry(Constant.illai, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0, topElmt.length - Constant.illai.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            ////System.out.println("true");
            return true;
        }
        // allAtha
        if (ByteMeth.endsWith(topElmt, Constant.allAtha)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "allAtha");
            s.pop();
            s.push(new Entry(Constant.allAtha, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.allAtha.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // aRRu
        if (ByteMeth.endsWith(topElmt, Constant.aRRu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "aRRu");
            s.pop();
            s.push(new Entry(Constant.aRRu, Tag.NegativeVerbalParticipleSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.aRRu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // alla
        if (ByteMeth.endsWith(topElmt, Constant.alla)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "alla");
            s.pop();
            s.push(new Entry(Constant.alla, Tag.NegativeFiniteVerbSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.alla.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // ethirE
        if (ByteMeth.endsWith(topElmt, Constant.ethirE)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "ethirE");
            s.pop();
            s.push(new Entry(Constant.ethirE, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.ethirE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // sArbAka
        if (ByteMeth.endsWith(topElmt, Constant.sArbAka)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "sArbAka");
            s.pop();
            s.push(new Entry(Constant.sArbAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.sArbAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // sArbil
        if (ByteMeth.endsWith(topElmt, Constant.sArbil)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "sArbil");
            s.pop();
            s.push(new Entry(Constant.sArbil, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.sArbil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

        /*// pAl
        if(ByteMeth.endsWith(topElmt,Constant.pAl) &&
        !ByteMeth.endsWith(topElmt,Constant.appAl))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "pAl");
        s.pop();
        s.push(new Entry(Constant.pAl,Tag.Particle));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.pAl.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }
         */
        // veLiyE
        if (ByteMeth.endsWith(topElmt, Constant.veLiyE)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "veLiyE");
            s.pop();
            s.push(new Entry(Constant.veLiyE, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.veLiyE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // vaziyAka
        if (ByteMeth.endsWith(topElmt, Constant.vaziyAka)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "vaziyAka");
            s.pop();
            s.push(new Entry(Constant.vaziyAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.vaziyAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mUlam
        if (ByteMeth.endsWith(topElmt, Constant.mUlam)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mUlam");
            s.pop();
            s.push(new Entry(Constant.mUlam, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mUlam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mUlamAka
        if (ByteMeth.endsWith(topElmt, Constant.mUlamAka)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mUlamAka");
            s.pop();
            s.push(new Entry(Constant.mUlamAka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mUlamAka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mIthu
        if (ByteMeth.endsWith(topElmt, Constant.mIthu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mIthu");
            s.pop();
            s.push(new Entry(Constant.mIthu, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mIthu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // padi
        if (ByteMeth.endsWith(topElmt, Constant.padi)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "padi");
            s.pop();
            s.push(new Entry(Constant.padi, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.padi.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // udaiya
        if (ByteMeth.endsWith(topElmt, Constant.udaiya)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "udaiya");
            s.pop();
            s.push(new Entry(Constant.udaiya, Tag.GenitiveCase));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.udaiya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //06-09-06
        // uriya
        if (ByteMeth.endsWith(topElmt, Constant.uriya)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uriya");
            s.pop();
            s.push(new Entry(Constant.uriya, Tag.AdjectivalSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uriya.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        //uriyathu
        if (ByteMeth.endsWith(topElmt, Constant.uriyathu)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uriyathu");
            s.pop();
            s.push(new Entry(Constant.uriyathu, Tag.FiniteVerbSuffix));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uriyathu.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        /*
        //clashes with 'evvaLavukku'
        //aLavukku
        if(ByteMeth.endsWith(topElmt,Constant.aLavukku))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "aLavukku");
        s.pop();
        s.push(new Entry(Constant.aLavukku,Tag.Particle));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.aLavukku.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }*/

        /*
        //clashes with 'padiyil'
        //adiyil
        if(ByteMeth.endsWith(topElmt,Constant.adiyil))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "adiyil");
        s.pop();
        s.push(new Entry(Constant.adiyil,Tag.Particle));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.adiyil.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        return true;
        }
         */
        // idaiyil
        if (ByteMeth.endsWith(topElmt, Constant.idaiyil)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "idaiyil");
            s.pop();
            s.push(new Entry(Constant.idaiyil, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.idaiyil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // idaiyE
        if (ByteMeth.endsWith(topElmt, Constant.idaiyE)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "idaiyE");
            s.pop();
            s.push(new Entry(Constant.idaiyE, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.idaiyE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // utpuRaththil
        if (ByteMeth.endsWith(topElmt, Constant.utpuRaththil)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "utpuRaththil");
            s.pop();
            s.push(new Entry(Constant.utpuRaththil, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.utpuRaththil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // utpuRam
        if (ByteMeth.endsWith(topElmt, Constant.utpuRam)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "utpuRam");
            s.pop();
            s.push(new Entry(Constant.utpuRam, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.utpuRam.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // uL
        if (ByteMeth.endsWith(topElmt, Constant.uL)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "uL");
            s.pop();
            s.push(new Entry(Constant.uL, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.uL.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // kIz
        if (ByteMeth.endsWith(topElmt, Constant.kIz)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kIz");
            s.pop();
            s.push(new Entry(Constant.kIz, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kIz.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.k(s);
            return true;
        }
        // kuRukkE
        if (ByteMeth.endsWith(topElmt, Constant.kuRukkE)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "kuRukkE");
            s.pop();
            s.push(new Entry(Constant.kuRukkE, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.kuRukkE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.k(s);
            return true;
        }
        // n_aduvil
        if (ByteMeth.endsWith(topElmt, Constant.n_aduvil)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_aduvil");
            s.pop();
            s.push(new Entry(Constant.n_aduvil, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_aduvil.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // n_aduvE
        if (ByteMeth.endsWith(topElmt, Constant.n_aduvE)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "n_aduvE");
            s.pop();
            s.push(new Entry(Constant.n_aduvE, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.n_aduvE.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }

        /*
        //pin
        if(ByteMeth.endsWith(topElmt,Constant.pin))
        {
        //clia.unl.unicode.utils.Utils.printOut(Analyser.print,x + "pin");
        s.pop();
        s.push(new Entry(Constant.pin,Tag.Particle));
        topElmt = ByteMeth.subArray(topElmt,0,topElmt.
        length-Constant.pin.length);
        s.push(new Entry(topElmt,-1,oldTopElmt));
        Sandhi.postposition(s);
        Sandhi.k(s);
        return true;
        }
         */
        // mun
        if (ByteMeth.endsWith(topElmt, Constant.mun)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mun");
            s.pop();
            s.push(new Entry(Constant.mun, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mun.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // munnar
        if (ByteMeth.endsWith(topElmt, Constant.munnar)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "munnar");
            s.pop();
            s.push(new Entry(Constant.munnar, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.munnar.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // mEl
        if (ByteMeth.endsWith(topElmt, Constant.mEl)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "mEl");
            s.pop();
            s.push(new Entry(Constant.mEl, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.mEl.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            return true;
        }
        // piRaku
        if (ByteMeth.endsWith(topElmt, Constant.piRaku)) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "piRaku");
            s.pop();
            s.push(new Entry(Constant.piRaku, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.piRaku.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.postposition(s);
            Sandhi.p(s);
            return true;
        }
        // Aka
        if (ByteMeth.endsWith(topElmt, Constant.Aka)
                && (ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.iRk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.aRk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.akk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.ukk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.kk, Constant.Aka))
                || ByteMeth.endsWith(topElmt, ByteMeth.addArray(Constant.ath, Constant.Aka)))) {
            //clia.unl.unicode.utils.Utils.printOut(Analyser.print, x + "Aka");
            s.pop();
            s.push(new Entry(Constant.Aka, Tag.Particle));
            topElmt = ByteMeth.subArray(topElmt, 0,
                    topElmt.length - Constant.Aka.length);
            s.push(new Entry(topElmt, -1, oldTopElmt));
            Sandhi.type4(s);
            return true;
        }


        if (flag == 1) {
            return true;
        }

        ////System.out.println("9A");
        return false;
    }


}
