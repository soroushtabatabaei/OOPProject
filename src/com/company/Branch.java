package com.company;

public abstract class Branch {
    Node in;
    Node out;
    double I;
    double getVoltage()
    {
        return in.V-out.V;
    }
    abstract void setI();
}

class Resistor extends Branch
{
    double R;
    @Override
    void setI() {
        I = getVoltage()/R;
    }
}

class I_DC extends Branch
{
    double I0;
    @Override
    void setI() {
        I = I0;
    }
}