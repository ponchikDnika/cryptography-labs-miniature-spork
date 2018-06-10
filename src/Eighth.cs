using System.Collections.Generic;
using System.Linq;

namespace RC4
{
    public static class Eighth
    {
        public static uint ReshuffleBits(uint num, List<int> reshuffle)
        {
            reshuffle.Reverse();
            return reshuffle
                .Where((t, index) => GetNthBit(num, index) > 0)
                .Aggregate<int, uint>(0, (current, t) => SetNthBit(current, t, 1));
        }

        public static uint GetNthBit(uint num, int position) => (uint)(num & (1 << position));

        public static uint SetNthBit(uint num, int bitPosition, uint value) => (uint)((num & ~(1 << bitPosition)) | (value << bitPosition));
    }
}
