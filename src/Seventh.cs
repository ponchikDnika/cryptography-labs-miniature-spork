public static class Seventh
{
    public static uint ShiftRight(uint zValue, int zShift)
        => ((zValue >> zShift) | (zValue << (16 - zShift))) & 0x0000FFFF;

    public static uint ShiftLeft(uint zValue, int zShift)
        => ((zValue << zShift) | (zValue >> (16 - zShift))) & 0x0000FFFF;
}
