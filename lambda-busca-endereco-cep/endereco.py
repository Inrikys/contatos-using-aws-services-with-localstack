class Endereco:
    def __init__(self, cep=None, logradouro=None, complemento=None, unidade=None, bairro=None,
                 localidade=None, uf=None, estado=None, regiao=None, ibge=None, gia=None, ddd=None, siafi=None):
        self._cep = cep
        self._logradouro = logradouro
        self._complemento = complemento
        self._unidade = unidade
        self._bairro = bairro
        self._localidade = localidade
        self._uf = uf
        self._estado = estado
        self._regiao = regiao
        self._ibge = ibge
        self._gia = gia
        self._ddd = ddd
        self._siafi = siafi

    def __str__(self):
        return f"{self.logradouro}, {self.bairro} - {self.localidade}/{self.uf} (CEP: {self.cep})"

    @property
    def cep(self):
        return self._cep

    @cep.setter
    def cep(self, value):
        self._cep = value

    @property
    def logradouro(self):
        return self._logradouro

    @logradouro.setter
    def logradouro(self, value):
        self._logradouro = value

    @property
    def complemento(self):
        return self._complemento

    @complemento.setter
    def complemento(self, value):
        self._complemento = value

    @property
    def unidade(self):
        return self._unidade

    @unidade.setter
    def unidade(self, value):
        self._unidade = value

    @property
    def bairro(self):
        return self._bairro

    @bairro.setter
    def bairro(self, value):
        self._bairro = value

    @property
    def localidade(self):
        return self._localidade

    @localidade.setter
    def localidade(self, value):
        self._localidade = value

    @property
    def uf(self):
        return self._uf

    @uf.setter
    def uf(self, value):
        self._uf = value

    @property
    def estado(self):
        return self._estado

    @estado.setter
    def estado(self, value):
        self._estado = value

    @property
    def regiao(self):
        return self._regiao

    @regiao.setter
    def regiao(self, value):
        self._regiao = value

    @property
    def ibge(self):
        return self._ibge

    @ibge.setter
    def ibge(self, value):
        self._ibge = value

    @property
    def gia(self):
        return self._gia

    @gia.setter
    def gia(self, value):
        self._gia = value

    @property
    def ddd(self):
        return self._ddd

    @ddd.setter
    def ddd(self, value):
        self._ddd = value

    @property
    def siafi(self):
        return self._siafi

    @siafi.setter
    def siafi(self, value):
        self._siafi = value

    def to_dict(self):
        return {
            "cep": self.cep,
            "logradouro": self.logradouro,
            "complemento": self.complemento,
            "unidade": self.unidade,
            "bairro": self.bairro,
            "localidade": self.localidade,
            "uf": self.uf,
            "estado": self.estado,
            "regiao": self.regiao,
            "ibge": self.ibge,
            "gia": self.gia,
            "ddd": self.ddd,
            "siafi": self.siafi,
        }

    class Builder:
        def __init__(self):
            self._endereco = Endereco()

        def cep(self, value):
            self._endereco.cep = value
            return self

        def logradouro(self, value):
            self._endereco.logradouro = value
            return self

        def complemento(self, value):
            self._endereco.complemento = value
            return self

        def unidade(self, value):
            self._endereco.unidade = value
            return self

        def bairro(self, value):
            self._endereco.bairro = value
            return self

        def localidade(self, value):
            self._endereco.localidade = value
            return self

        def uf(self, value):
            self._endereco.uf = value
            return self

        def estado(self, value):
            self._endereco.estado = value
            return self

        def regiao(self, value):
            self._endereco.regiao = value
            return self

        def ibge(self, value):
            self._endereco.ibge = value
            return self

        def gia(self, value):
            self._endereco.gia = value
            return self

        def ddd(self, value):
            self._endereco.ddd = value
            return self

        def siafi(self, value):
            self._endereco.siafi = value
            return self

        def build(self):
            return self._endereco