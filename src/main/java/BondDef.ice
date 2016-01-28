#ifndef DTO_BOND_DEF
#define DTO_BOND_DEF

module com{
    module example{
      module transfer{
        module dto{
            // 债券对象
            class Bond{

                //Fields
                string name;
                string code;

                //Methods
                string getName();
                void setName(string name);

                string getCode();
                void setCode(string code);
            };
        };
      };
    };
};
#endif
