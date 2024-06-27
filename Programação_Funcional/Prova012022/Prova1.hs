-- QUESTÃO 1
conta :: (a -> Bool) -> [a] -> int
conta _ [] = 0
conta y (x:xs) = 1 + conta y-1 xs
    where
        y > 0



-- QUESTÃO 2 
divide :: Int -> [a] -> ([a], [a])
divide _ [] = [] []
divide x y : ys = 



-- QUESTÃO 3 
words :: String -> [String] -- Divide a string nas palavras
isLetter :: Char -> Bool -- Confere o caractere pra ver se é letra

capitalize :: String -> String
capitalize 
    | [] = []
    | x : xs = if isLetter head (head y) == True then ToUpper head (head y) else False
                where
                    y = map words z

-- QUESTÃO 4
data Task = Task String Int
data Project = Project [Task]

-- A
validTask :: Task -> Bool
validTask Task _ a = True
    where
        a > 0
        otherwise False



-- B
validProject :: Project -> Bool
validProject  if map ValidTask [xs] == True then True else False



-- C
totalTime :: Project -> Int
totalTime 

