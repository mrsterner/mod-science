package malek.mod_science.power;

public interface IPowerReceiver extends IPower {

    void markNetworkDirty();
    boolean isNetworkDirty();
}