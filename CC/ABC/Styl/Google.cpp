if (degree == 0) {
  return 0;
} else if (size == 2) {
  return 2;
} else if (index == 1) {
  return 1;
} else {
  return 3;
}

- - - - - - - - - - - - - - - - - - - - 

if (graph.lefts.size() == Single) return LEFT;
else if (graph.rights.size() == Single) return RIGHT;
else if (graph.tops.size() == Single) return TOP;
else if (graph.bottoms.size() == Single) return BOTTOM;
else
  return 0; 

- - - - - - - - - - - - - - - - - - - - 

friend ostream& operator<<(ostream& out, const Graph& graph); 
void process_one(Graph& graph); 


  
