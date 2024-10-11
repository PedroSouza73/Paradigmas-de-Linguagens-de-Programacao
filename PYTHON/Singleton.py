class Configuracao:
    _instance = None
    _initialized = False

    def __new__(cls, *args, **kwargs):
        if cls._instance is None:
            cls._instance = super(Configuracao, cls).__new__(cls)
        return cls._instance

    def __init__(self, valor_config):
        if not self._initialized:
            self.valor_config = valor_config
            self._initialized = True

config1 = Configuracao('Configuração A')
config2 = Configuracao('Configuração B')

print(config1.valor_config)  
print(config2.valor_config)  
print(config1 is config2)   
