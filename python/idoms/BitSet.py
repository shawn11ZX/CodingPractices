class BitSet:
    def __init__(self):
        self.data = 0

    def set(self, idx):
        self.data |= 1 << idx

    def get(self, idx):
        return (self.data >> idx) & 0x1

    def clear(self, idx):
        self.data &= ~(1 << idx)

    def get_value(self):
        return self.data

    def set_value(self, v):
        self.data = v

    def init(self, ls):
        for i in range(len(ls)):
            if ls[i]:
                self.set(i)
