import os
import yaml




wd = os.getcwd()
for f in [x for x in os.listdir(wd) if x.endswith('.yml')]:
    data =None
    with open(f,'r') as yml:
        data = yaml.safe_load(yml)
    test = data['firmwares']  
    test[0]['deviceClass']= 'please work'
    test2 = data['settings'] 
    test2.update(dict(devicesPerRelay='RivaGasModule'))
    with open(f, 'wb') as stream:
        yaml.safe_dump(data, stream, default_flow_style=False, 
                 explicit_start=True, allow_unicode=True, encoding='utf-8')