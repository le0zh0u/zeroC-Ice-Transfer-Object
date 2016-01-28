#ifndef OPERATOR_MAINOPERATOR_DEF
#define OPERATOR_MAINOPERATOR_DEF

module com{

    module example{
        module transfer{
            module dto{
                class Bond;
            };

            module operator{
                interface MainOperator{
                    idempotent void transferBond(com::example::transfer::dto::Bond bond);
                    idempotent com::example::transfer::dto::Bond getBond(string name);
                };
            };
        };
    };
};
#endif
