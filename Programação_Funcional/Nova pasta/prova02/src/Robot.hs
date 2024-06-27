module Robot ( readLDM
             , readLCR
             , run
             )where

import Control.Monad.State
import Parsing 



type Fuel = Int
type Point = (Int,Int)
type Material = Int

data Robot = Robot {
                energy    :: Fuel,
                position  :: Point,
                collected :: Material
             } deriving (Eq, Ord)

sampleRobot :: Robot
sampleRobot = Robot {
                 energy = 100,
                 position = (1,1),
                 collected = 0
              }


-- QUESTÃO 1
instance Show Robot where
  show (energy Fuel) = "Energy:" ++ show Fuel ++ "\n"
  show (position Point) = "Position:" ++ show Point ++ "\n"
  show (collected Material) = "Collected:" ++ show Material

data Element = Empty         -- espaço vazio
             | Entry         -- entrada da mina
             | Wall          -- parede
             | Earth         -- terra
             | Rock          -- rocha
             | Material Int  -- material, Int indica quantidade.
             deriving (Eq,Ord)


-- QUESTÃO 2
instance Show Element where
  show (Empty) = " "
  show (Entry) = "E"
  show (Wall) = "%"
  show (Earth) = "."
  show (Rock) = "*"
  show (Material 50) = "?"
  show (Material 100) = ":"
  show (Material 150) = ";"
  show (Material x) = "$"


-- QUESTÃO 3
pElement :: Parser Char Element
pElement [a] = Element
  where
    Empty = satisfy (== " ")
    Entry = satisfy (== "E")
    Wall = satisfy (== "%")
    Earth = satisfy (== ".")
    Rock = satisfy (== "*")
    Material = satisfy (== ":")
    Material = satisfy (== ";")
    Material = satisfy (== "$")


type Line = [Element]

data Mine = Mine {
              lines    :: Int,
              columns  :: Int,
              elements :: [Line]
            } deriving (Eq, Ord)


-- QUESTÃO 7
instance Show Mine where
  show = undefined

-- QUESTÃO 4
validMine :: Mine -> Bool
validMine [] = False
validMine [(lines == lenght elements) && (columns == lenght $ head elements)] = True

-- QUESTÃO 5
exampleMine :: Mine
exampleMine show 


-- QUESTÃO 6
pLine :: Parser Char Line
pLine [a] = Line
  where
    ff

pMine :: Parser Char Mine
pMine [a] = Mine
  where
    ff



-- QUESTÃO 8

data Instr = L -- move para esquerda
           | R -- move para direita
           | U -- move para cima
           | D -- move para baixo
           | C -- coleta material
           | S -- para para recarga.
           deriving (Eq,Ord,Show,Enum)

pInstr :: Parser Char Instr
pInstr = undefined

pProgram :: Parser Char [Instr]
pProgram = undefined

type Conf = (Robot, Mine)

type ConfM a = State Conf a


current :: ConfM Point
current = undefined

mine :: ConfM Mine
mine = undefined

enoughEnergy :: Int -> ConfM Bool
enoughEnergy = undefined

incEnergy :: ConfM ()
incEnergy = undefined

valid :: Instr -> ConfM Bool
valid = undefined


updateMine :: Instr -> ConfM ()
updateMine = undefined

exec :: Instr -> ConfM ()
exec = undefined

initRobot :: Mine -> Robot
initRobot = undefined

run :: [Instr] -> Mine -> Mine
run = undefined

readLDM :: String -> IO (Either String Mine)
readLDM = undefined

readLCR :: String -> IO (Either String [Instr])
readLCR = undefined
