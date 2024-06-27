xor :: bool -> bool -> bool
xor True True = False
xor True False = True
xor False False = True
xor False True = False