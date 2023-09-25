package Inheritance.polymorphism;

public /*final*/ class TvShowroom {

        /*final*/  void channels()
        {
            System.out.println("TvShowroom : channels");
        }
        void  volumeControl()
        {
            System.out.println("TvShowroom : volumeControl");
        }
        void settings()
        {
            System.out.println("TvShowroom : settings");
        }
}

class Samsung extends TvShowroom {

    void channels()
    {
        System.out.println("Samsung : channels");
    }
    void  volumeControl()
    {
        System.out.println("Samsung : volumeControl");
    }
    void settings()
    {
        System.out.println("Samsung : settings");
    }
}

class LG extends TvShowroom {

    void channels()
    {
        System.out.println("LG : channels");
    }
    void  volumeControl()
    {
        System.out.println("LG : volumeControl");
    }
    void settings()
    {
        System.out.println("LG : settings");
    }
}

class Onida extends TvShowroom {

    void channels()
    {
        System.out.println("Onida : channels");
    }
    void  volumeControl()
    {
        System.out.println("Onida : volumeControl");
    }
    void settings()
    {
        System.out.println("Onida : settings");
    }
}

class TestOverriding
{
    public static void main(String[] args) {

        TvShowroom tvShowroom = new Samsung(); // up casting
        tvShowroom.channels();
        tvShowroom.volumeControl();
        tvShowroom.settings();

    }
}
