package com.education.hszg.thi;

public class AlgorithmDifinition {

    /*
    Definition Algo,
    a) finit
    b) deterministisch
    c) determiniert
    */

    public boolean AlgDeterministicAndDetermined(int i){
        int b = i + 2;
        //ToDo
        if (b>3){return true;}
        return false;
        //finit weil 3 Anweisungen / weil 39 Zeichen (nicht infinite)
        //deterministisch: Ja nirgendwo eine Wahl
        //determiniert: Ja, da finit und deterministisch ➡️ determiniert
    }

    public boolean TextDetermined(int i){
        int b = i + 2;
        long l = System.nanoTime();
        if (b>3){return true;}
        return false;
        //finit ja,...
        //deterministisch: nein nanoTime giebt zufalls zahl
        //determiniert: Nein, da finit und deterministisch ➡️ determiniert

        //wenn long l eingabewert ist, dann wäre es ein Algo
    }

    public boolean AlgThatNotTerminates(int i){
        while (true)
            System.out.println("Ich höre nie auf! HAHAHAHAHAH ... ?! HILFE!!!");
        //return false //gibt bei mir nen Fehler idk why

        //finit
        //deterministisch
        //determiniert
        //terminiert: Nur optional

    }




}
