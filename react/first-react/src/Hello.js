const Hello = ({ color, name, isSpecial }) => {
  return (
    <div style={{ color }}>
      안녕하세요. {name}
      {isSpecial && <b>**</b>}
    </div>
  );
};

Hello.defaultProps = {
  color: "pink",
  name: "carami",
  isSpecial: false,
};
export default Hello;
